public class AmericanFlag {
    public static void main(String args[]) {
        for (int i = 0; i<4; i++){
            for (int j = 0; j<8; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j< 28; j++) {
                System.out.print("=");
            }
            System.out.println();
            for (int j=0; j<8; j++) {
                System.out.print(" *");
            }
            for (int j = 0; j< 28; j++) {
                System.out.print("=");
            }
            System.out.println();
        } 
        for (int j = 0; j<6; j++) {
            for (int k=0; k<44; k++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}