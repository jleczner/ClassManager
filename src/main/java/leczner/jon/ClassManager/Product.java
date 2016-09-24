package leczner.jon.ClassManager;

/**
 * Created by jonathanleczner on 9/20/16.
 */
public class Product {
    private double price;
    private static int idCounter;
    private int id;
    private int onHand;

    public Product(double price) {
        this.price = price;
        this.id = idCounter;
        idCounter++;
        onHand = 0;
    }

    public double getPrice() {
        return  price;
    }

    public int getId() {
        return id;
    }

    public int getOnHand() {
        return onHand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addStock(int amount) {
        onHand += amount;
    }
}
