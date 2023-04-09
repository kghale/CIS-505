package Module_4.BowlingShopApp;

public class Ball extends Product {
    private String color;

    // Constructor
    public Ball() {
        super();
        this.color = "";
    }

    // Accessor and mutator methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + "\n\tColor: " + color;
    }
}

