class InvertedTri {
    public static void main(String[] args) {
        int i, j, k;
        for(i = 1; i<=5; i++) {
            for (k = 0; k<i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j<6-i; j++) {
                System.out.print("**");
            } 
            System.out.println();
        }
    }
}