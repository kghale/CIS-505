package Module_4.BowlingShopApp;

public class Shoe extends Product {
    private double size;

    // Constructor
    public Shoe() {
        super();
        this.size = 0;
    }

    // Accessor and mutator methods for size
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + "\n\tSize: " + size;
    }
}

