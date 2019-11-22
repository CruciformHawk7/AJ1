import java.util.LinkedList; 

class PC { 
    LinkedList<Integer> list = new LinkedList<Integer>();  
    static int value = 0; 

    synchronized public void produce() throws InterruptedException { 
        while (true) {  
            while (list.size() == 5) wait(); 
            System.out.println("produced: " + value + ", stock: " + list.size()); 
            list.add(value++); 
            notify(); 
            Thread.sleep(500); 
        } 
    } 

    synchronized public void consume() throws InterruptedException  { 
        while (true) { 
            while (list.size() == 0)  wait(); 
            System.out.println("consumed: " + list.removeFirst() + ", stock: " + list.size()); 
            notify(); 
            Thread.sleep(500); 
        } 
    } 
} 

public class ProdCons { 
	public static void main(String[] args) throws InterruptedException { 
        PC pc = new PC(); 
		Thread producer = new Thread(() -> { 
            try { pc.produce(); }
            catch (InterruptedException e) { System.out.println(e); }
		}); 
		Thread consumer = new Thread(() -> { 
            try { pc.consume(); }
            catch (InterruptedException e) { System.out.println(e); }
		}); 
		producer.start(); 
		consumer.start(); 
		producer.join(); 
        consumer.join(); 
    } 
}
