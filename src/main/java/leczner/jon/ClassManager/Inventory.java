package leczner.jon.ClassManager;

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
        return;
    }

    public double calculateTotal() {
        return 0;
    }
}
