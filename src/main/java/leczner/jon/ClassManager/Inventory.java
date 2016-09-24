package leczner.jon.ClassManager;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by jonathanleczner on 9/20/16.
 */
public class Inventory {
    private HashMap<Integer, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public HashMap<Integer, Product> getInventory() {
        return inventory;
    }

    public void add(Product p) {
        inventory.put(p.getId(), p);
    }

    public void remove(Product p) {
        inventory.remove(p.getId());
    }

    public double calculateTotal() {
        double total = 0;
        Collection<Product> products = inventory.values();
        for (Product p : products) {
            total += p.getOnHand() * p.getPrice();
        }
        return total;
    }
}
