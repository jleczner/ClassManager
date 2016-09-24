package leczner.jon.ClassManager;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jonathanleczner on 9/24/16.
 */
public class ProductTest {
    Product p = new Product(1.00);

    @Test
    public void addStockTest() {
        p.addStock(3);
        assertEquals(3, p.getOnHand());
    }
}
