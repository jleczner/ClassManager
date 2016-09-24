package leczner.jon.ClassManager;

/**
 * Created by jonathanleczner on 9/24/16.
 */
public class App {
    public static void main(String[] args) {
        Inventory i = new Inventory();
        Product bread = new Product(2.49);
        Product milk = new Product(4.99);

        i.add(bread);
        bread.addStock(5);

        Product first = i.getInventory().get(0);
        System.out.println(first.getId());
        System.out.println(first.getOnHand());
        System.out.println(first.getPrice());

        milk.addStock(1);
        i.add(milk);
        i.remove(bread);
        System.out.println(i.calculateTotal());
    }
}
