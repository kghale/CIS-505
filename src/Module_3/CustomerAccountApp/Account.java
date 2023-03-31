package Module_3.CustomerAccountApp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account {
    private double balance;

    public Account() {
        balance = 200.0; // default balance
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        String userInput;
        String continueStatus;
        do {
            System.out.println("\tAccount Menu");
            System.out.println("\tEnter <D/d> for deposit");
            System.out.println("\tEnter <W/w> for withdraw");
            System.out.println("\tEnter <B/b> for balance");
            System.out.print("\t\tEnter option>: ");
            userInput = sc.next();
            System.out.println();
            switch (userInput) {
                case "B","b":
                    System.out.println("\tAccount balance: $" + balance);
                    System.out.println();
                    break;
                case "D","d":
                    System.out.print("\tEnter deposit amount: ");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println();
                    break;
                case "W" ,"w":
                    System.out.print("\tEnter withdraw amount: ");
                    amt = sc.nextDouble();
                    withdraw(amt);
                    System.out.println();
                    break;
                default:
                    System.out.println("\tError: Invalid option");
                    System.out.println();
                    break;
            }
            System.out.print("\tContinue? (y/n): ");
            continueStatus = sc.next();
            System.out.println();
        } while (continueStatus.equalsIgnoreCase("y"));
    }

    public String getTransactionDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        Date currentDate = new Date();
        return formatter.format(currentDate);
    }
}
