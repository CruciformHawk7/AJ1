import java.util.Scanner;

class WrongMarkException extends Exception {
    @Override public String toString() {
        return "Invalid marks, Exiting.";
    }
}

class Marks {
    public static void main(String[] args) {
        int[] marks = new int[20]; int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 marks: ");
        try {
            for (int i = 0; i<20; i++) {
                temp = sc.nextInt();
                if (temp<0 || temp>100) throw new WrongMarkException();
                else marks[i] = temp;
            }
        } catch (WrongMarkException e) {
            System.out.println("Exception caught " + e);
        } finally {
            int sum = 0;
            for (var mark : marks) sum+=mark;
            System.out.println("Sum is: " +sum);
            sc.close();
        }
    } 
}