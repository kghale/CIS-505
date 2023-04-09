package Module_4.BowlingShopApp;

import java.util.Scanner;

public class TestBowlingShopApp {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("\n\tWelcome to the Bowling Shop!\n");
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("\tMENU OPTIONS");
            System.out.println("\t\t1. <b> Bowling Balls");
            System.out.println("\t\t2. <a> Bowling Bags");
            System.out.println("\t\t3. <s> Bowling Shoes");
            System.out.print("\t\t4. <x> To exit\n\n");
            System.out.print("\tPlease choose an option: ");
            choice = input.next();

            GenericQueue<Product> products;
            if (choice.equals("b")) {
                products = ProductDB.getProducts("b");
                System.out.println("\n\t--Product Listing--");
            } else if (choice.equals("s")) {
                products = ProductDB.getProducts("s");
                System.out.println("\n\t--Product Listing--");
            } else if (choice.equals("a")) {
                products = ProductDB.getProducts("a");
                System.out.println("\n\t--Product Listing--");
            } else {
                break; // exit loop
            }

            int count = 1;
            while (products.size() > 0) {
                Product p = products.dequeue();
                System.out.println("\t" + p + "\n");
                count++;
            }
        } while (!choice.equals("x"));

        System.out.println("\n\tEnd of line...");
    }
}

