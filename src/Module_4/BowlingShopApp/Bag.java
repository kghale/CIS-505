package Module_4.BowlingShopApp;

public class Bag extends Product {
    private String type;

    // Constructor
    public Bag() {
        super();
        this.type = "";
    }

    // Accessor and mutator methods for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + "\n\tType: " + type;
    }
}

