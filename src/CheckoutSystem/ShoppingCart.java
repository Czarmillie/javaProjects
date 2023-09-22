package CheckoutSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        items.add(new Item(product, quantity));
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotal();
        }
        return total;
    }
}
