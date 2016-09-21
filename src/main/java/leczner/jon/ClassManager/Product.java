package leczner.jon.ClassManager;

/**
 * Created by jonathanleczner on 9/20/16.
 */
public class Product {
    private double price;
    private int id;
    private int onHand;

    public Product() {

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
        return;
    }
}
