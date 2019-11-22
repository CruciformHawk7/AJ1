import java.io.*;
import java.util.*;

class PrimeNumbers {
    static boolean isPrime(int number) {
        boolean notPrime = false;
        if (number==1) return false;
        for (int i = 2; i<(number); i++) {
            notPrime = false;
            if (number%i==0) { 
                notPrime=true;
                break;
            }
        }
        if (notPrime==true) return false;
        else return true;
    } 

    static int[] convertToInt(ArrayList<Integer> input) {
        int items[] = new int[input.size()];
        int i = 0;
        for(int x : input) {
            items[i++] = x;
        }
        return items;
    }

    static int[] allPrimes(int start, int end) {
        ArrayList<Integer> vals = new ArrayList<Integer>();
        for (int i = start; i<=end; i++) {
            if (isPrime(i)) vals.add(i);
        }
        return convertToInt(vals);
    }

    static void oneToN() throws IOException {
        int primes[];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the start position: ");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter the end position: ");
        int end = Integer.parseInt(br.readLine());
        primes = allPrimes(start, end);
        for (int prime: primes) {
            System.out.print(prime + ", ");
        }
        System.out.println();
    }

    static void first100() throws IOException{
        int primes[] = allPrimes(1, 100);
        int q = 10;
        for (int prime: primes) {
            System.out.print(prime + ", ");
        }
        System.out.println();
        if (q==111) throw new IOException();
    }

    static void checkPrime() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());
        if (isPrime(num)) System.out.println("The number is prime.");
        else System.out.println("The number is not prime");
    }

    static void printAlternatePrimes() throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int primes[];
        System.out.println("Enter starting range: ");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter ending range: ");
        int end = Integer.parseInt(br.readLine());
        primes = allPrimes(start, end);
        int i = 0;
        for(int prime: primes) {
            if (i==1) { System.out.println(prime); i=0; }
            else { i = 1;}
        }
    }

    public static void main(String args[]){
        try {
            //checkPrime();
            first100();
            //oneToN();
        } catch (IOException ex) {
            System.out.println("Failed to run");
            System.exit(200);
        }
    }
}