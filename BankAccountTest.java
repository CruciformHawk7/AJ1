import java.io.*;

class BankAccount {
    int accountNumber;
    String name;
    float balance;
    BufferedReader br;

    BankAccount() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void createAccount() throws IOException {
        System.out.println("Enter the account number: ");
        this.accountNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter the name: ");
        this.name = br.readLine();
        System.out.println("Enter the balance: ");
        balance = Float.parseFloat(br.readLine());
    }

    @Override
    public String toString() {
        return ("Account Number: \t " + this.accountNumber + 
            "\nName:\t\t\t" + this.name + "\nBalance:\t\t" + this.balance);
    }

    public void transaction() throws IOException {
        System.out.println("Enter\n1. Withdrawl\n2. Deposit\n:");
        int ch = Integer.parseInt(br.readLine());
        System.out.println("Enter the amount: ");
        float amount = Float.parseFloat(br.readLine());
        if (ch==1) {
            this.balance -= amount;
        } else if (ch==2) {
            this.balance += amount;
        } else {
            System.out.println("Invalid choice!");
        }
    }
}

public class BankAccountTest {
    public static void main(String args[]) throws IOException {
        BankAccount bAccount = new BankAccount();
        bAccount.createAccount();
        System.out.println(bAccount);
        bAccount.transaction();
        System.out.println(bAccount);
    }
}