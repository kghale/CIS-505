package Module_5.ExpenseTrackerApp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;
        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }
        for (Transaction t : transactions) {
            output.print(t.getDate() + ",");
            output.print(t.getDescription() + ",");
            output.println(t.getAmount());
        }
        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] parts = line.split(",");
            String date = parts[0];
            String description = parts[1];
            double amount = Double.parseDouble(parts[2]);
            transactions.add(new Transaction(date, description, amount));
        }
        input.close();
        return transactions;
    }
}

