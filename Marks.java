import java.util.Scanner;

class WrongMarkException extends Exception {
    @Override public String toString() {
        return "Invalid marks, Exiting.";
    }
}

class Marks {
    public static void main(String[] args) {
        int[] marks = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 marks: ");
        try {
            for (int i = 0; i<20; i++) {
                marks[i] = sc.nextInt();
                if (marks[i]<0 || marks[i]>100) throw new WrongMarkException();
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