package Module_4.BowlingShopApp;

public class ProductDB {
    public static GenericQueue<Product> getProducts(String code) {
        GenericQueue<Product> products = new GenericQueue<>();
        double priceArray[] = new double[] {154.99, 139.99, 174.95, 144.95, 100.99};
        double sizeArray[] = new double[] {8.5, 9.5, 7, 4, 10};
        if (code.equals("b")) {
            for (int i = 1; i <= 5; i++) {
                String colorArray[] = new String[] {"Purple and Green", "Red and White", "Pink and Purple", "Blue and Red", "Black and Red"};
                Ball ball = new Ball();
                ball.setCode("B" + i * 100);
                ball.setDescription("Phase " + i);
                ball.setPrice(priceArray[i-1]);
                ball.setColor(colorArray[i-1]);
                products.enqueue(ball);
            }
        }
        else if (code.equals("s")) {

            for (int i = 1; i <= 5; i++) {
                Shoe shoe = new Shoe();
                shoe.setCode("S" + i * 100);
                shoe.setDescription("Force Unleashed " + i);
                shoe.setPrice(priceArray[i-1]);
                shoe.setSize(sizeArray[i-1]);
                products.enqueue(shoe);
            }
        }
        else if (code.equals("a")) {
            String typeArray[] = new String[] {"Double", "Hand Bag", "Side Bag", "Single", "Utility Bag"};
            for (int i = 1; i <= 3; i++) {
                Bag bag = new Bag();
                bag.setCode("A" + i * 100);
                bag.setDescription("Bowling bag #" + i);
                bag.setPrice(priceArray[i-1]);
                bag.setType(typeArray[i-1]);
                products.enqueue(bag);
            }
        }

        return products;
    }
}

