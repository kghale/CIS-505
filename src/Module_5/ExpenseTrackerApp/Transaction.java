package Module_5.ExpenseTrackerApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    // Default constructor
    public Transaction() {
        setDate(LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
        setDescription("");
        setAmount(0);
    }

    // Argument constructor
    public Transaction(String date, String description, double amount) {
        setDate(date);
        setDescription(description);
        setAmount(amount);
    }

    // Accessor methods
    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    // Mutator methods
    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "\tDate: " + date + "\n\tDescription: " + description + "\n\tAmount: " + amount;
    }
}

