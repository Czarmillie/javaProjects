package CheckoutSystem;

import java.text.SimpleDateFormat;
import java.util.*;

class CheckoutSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String storeName = "SEMICOLON STORES";
        String branchLocation = "MAIN BRANCH";
        String location = "Location: 312, HERBERT MACAULY WAY, SABO YABA, LAGOS.";
        String tel = "Tel: 03293828343";

        System.out.println("What is the cashier's name?");
        String cashierName = scanner.nextLine();

        System.out.println("What is the customer's name?");
        String customerName = scanner.nextLine();

        ShoppingCart cart = new ShoppingCart();

        boolean addMoreItems = true;
        while (addMoreItems) {
            System.out.println("What did the user buy?");
            String itemName = scanner.nextLine();
            System.out.println("How many pieces?");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("How much per unit?");
            double price = Double.parseDouble(scanner.nextLine());

            Product product = new Product(itemName, price);
            cart.addItem(product, quantity);

            System.out.println("Add more items? (Yes/No)");
            String answer = scanner.nextLine().toLowerCase();
            addMoreItems = answer.equals("yes");
        }

        double subtotal = cart.calculateTotal();
        double discount = subtotal * 0.08;
        double vat = subtotal * 0.075;
        double total = subtotal - discount + vat;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy h:mm:ss a");
        String date = dateFormat.format(new Date());

        System.out.println(storeName);
        System.out.println(branchLocation);
        System.out.println(location);
        System.out.println(tel);
        System.out.println("Date: " + date);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer name: " + customerName);
        System.out.println("==============================================");

        System.out.println("ITEM\tQTY\t\tPRICE\t\t\tTOTAL(NGN)");
        for (Item item : cart.getItems()) {
            System.out.println(item.getDescription());
        }

        System.out.println("Sub Total:\t\t" + String.format("%.2f", subtotal));
        System.out.println("Discount:\t\t" + String.format("%.2f", discount));
        System.out.println("VAT @17.5%:\t\t" + String.format("%.2f", vat));
        System.out.println("==============================================");
        System.out.println("Bill Total:\t\t" + String.format("%.2f", total));

        System.out.println("How much did the customer give to you?");
        double amountPaid = Double.parseDouble(scanner.nextLine());
        double balance = amountPaid - total;

        System.out.println("Amount Paid:\t\t" + String.format("%.2f", amountPaid));
        System.out.println("Balance:\t\t" + String.format("%.2f", balance));
        System.out.println("=================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("==================================================");
    }
}