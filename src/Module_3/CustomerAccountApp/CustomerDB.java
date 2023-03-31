package Module_3.CustomerAccountApp;

public class CustomerDB {
    public static Customer getCustomer(Integer id) {
        if (id == 1007) {
            return new Customer("Jennifer Patterson", "8422 Grover Ave.", "Bellevue", "68123");
        } else if (id == 1008) {
            return new Customer("Emma Watson", "45622 Elm St.", "Kingsgate", "67990");
        } else if (id == 1009) {
            return new Customer("Ryan Reynolds", "78999 Maple Ave", "Woodinville", "54221");
        } else {
            return new Customer(); // default customer
        }
    }
}
