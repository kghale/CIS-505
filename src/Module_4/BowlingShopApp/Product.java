package Module_4.BowlingShopApp;

public class Product {
    private String code;
    private String description;
    private double price;

    // Constructor
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0.0;
    }

    // Accessor methods
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // Mutator methods
    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "Product Code: " + code + "\n\tDescription: " + description + "\n\tPrice: $ " + price;
    }
}

