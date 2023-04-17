package Module_5.ExpenseTrackerApp;

import java.util.Scanner;

public class ValidatorIO {
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n\tError! Invalid integer value.\n");
            }
            sc.nextLine();
        }

        return input;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double input = 0.0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("\n\tError! Invalid double value.\n");
            }
            sc.nextLine();
        }

        return input;
    }

    public static String getString(Scanner sc, String prompt) {
        System.out.printf(prompt);
        return sc.next();
    }
}

