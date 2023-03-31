package Module_3.CustomerAccountApp;

import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\tWelcome to the Customer Account App");
        System.out.println();

        // Prompt user to enter customer number
        System.out.println("\tEnter a customer ID:");
        System.out.print("\t\tex: 1007, 1008, 1009>: ");
        int customerId = input.nextInt();
        System.out.println();

        // Retrieve customer using customer number
        Customer customer = CustomerDB.getCustomer(customerId);

        // Display account menu
        Account account = new Account();
        account.displayMenu();

        System.out.println("\t--Customer Details--");
        System.out.println(customer);
        System.out.println();
        System.out.println("\tBalance as of " + account.getTransactionDate() + " is $" + account.getBalance());
        System.out.println();
        System.out.println("\tEnd of line...");
    }
}
