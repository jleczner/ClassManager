package leczner.jon.ClassManager;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonathanleczner on 9/24/16.
 */
public class InventoryTest {
    Inventory i = new Inventory();
    Product p = new Product(1.00);

    @Test
    public void addTest() {
        i.add(p);
        assertNotNull(i.getInventory().get(0));
    }

    @Test
    public void removeTest() {
        i.add(p);
        i.remove(p);
        assertTrue(i.getInventory().isEmpty());
    }

    @Test
    public void calculateTotalTest() {
        p.addStock(5);
        i.add(p);
        assertEquals(5.0, i.calculateTotal(), 0);
    }
}
