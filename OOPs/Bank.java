import java.util.*;

class BankAccount {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void printBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount obj = new BankAccount();
        obj.balance = 1000;

        System.out.println("Enter deposit amount:");
        int dep = sc.nextInt();
        obj.deposit(dep);

        System.out.println("Enter withdrawal amount:");
        int wit = sc.nextInt();
        obj.withdraw(wit);

        obj.printBalance();
    }
}