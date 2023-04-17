package Module_5.ExpenseTrackerApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {
    public static void main(String[] args) {
        System.out.println("\tWelcome to the Expense Tracker\n");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\tMENU OPTIONS:");
            System.out.println("\t\t1. View Transactions");
            System.out.println("\t\t2. Add Transactions");
            System.out.println("\t\t3. View Expense\n");

            int choice = ValidatorIO.getInt(input, "\tPlease choose an option: ");

            try {
                switch (choice) {
                    case 1:
                        viewTransactions();
                        break;
                    case 2:
                        addTransaction();
                        break;
                    case 3:
                        displayTotalExpenses();
                        break;
                    default:
                        System.out.println("\tInvalid choice. Please try again.");
                }
            } catch (IOException e) {
                System.out.println("\n\tAn error occurred: " + e.getMessage());
            }

            System.out.println();
            boolean continueProgram = ValidatorIO.getString(input, "\tContinue? (y/n): ").equalsIgnoreCase("y");
            if (!continueProgram) {
                System.out.println("\n\tProgram terminated by the user...");
                break;
            }
            System.out.println();
        }
    }

    private static void viewTransactions() throws IOException {
        ArrayList<Transaction> transactions = TransactionIO.findAll();
        if (transactions.isEmpty()) {
            System.out.println("\n\tNo transactions found.");
        } else {
            System.out.println("\n\tMONTHLY EXPENSES\n");
            for (Transaction transaction : transactions) {
                System.out.printf("\tDate: %s \n\tDescription: %s\n\tAmount: %s\n\n", transaction.getDate(), transaction.getDescription(), formatAmount(transaction.getAmount()));
            }
        }
    }

    private static void addTransaction() throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<Transaction> transactionList = new ArrayList<>();
        while (true) {
            String date = ValidatorIO.getString(input, "\n\tEnter the date (MM-dd-yyyy): ");
            String description = ValidatorIO.getString(input, "\tEnter the description: ");
            double amount = ValidatorIO.getDouble(input, "\tEnter the amount: ");
            Transaction transaction = new Transaction(date, description, amount);
            transactionList.add(transaction);

            boolean addAnotherTransaction = ValidatorIO.getString(input, "\n\tAdd another transaction? (y/n) ").equalsIgnoreCase("y");
            if (!addAnotherTransaction) {
                break;
            }
        }
        TransactionIO.bulkInsert(transactionList);
    }

    private static void displayTotalExpenses() throws IOException {
        ArrayList<Transaction> transactions = TransactionIO.findAll();
        double totalExpenses = 0;
        for (Transaction transaction : transactions) {
            totalExpenses += transaction.getAmount();
        }
        System.out.printf("\n\tYour total monthly expense is %s\n", formatAmount(totalExpenses));
    }

    private static String formatAmount(double amount) {
        return String.format("$%,6.2f", amount);
    }
}

