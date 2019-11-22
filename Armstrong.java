import java.io.*;

class Armstrong {
    static long armstrongOf(int x) {
        long out = 0;
        while (x != 0) {
            int p = x%10;
            out += p*p*p;
            x/=10;
        }
        return out;
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int p = Integer.parseInt(br.readLine());
        if ((long)p==armstrongOf(p)) System.out.println("It is armstrong");
        else System.out.println("It is not armstrong");
    }
}