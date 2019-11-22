class Smallest {
    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("Few args");
            System.exit(0);
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min = (a < b) ? ((a < c) ? a : c) : ((b < c)? b : c);
        System.out.println("Min is: " + min); 
    }
}