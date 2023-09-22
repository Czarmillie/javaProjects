package CheckoutSystem;

public class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return product.getPrice() * quantity;
    }

    public String getDescription() {
        return String.format("%s\t%d\t\t%.2f:00\t%.2f", product.getName(), quantity, product.getPrice(), getTotal());
    }
}
