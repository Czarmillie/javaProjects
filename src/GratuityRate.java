import java.util.Scanner;

public class GratuityRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal: $");
        double subtotal = scanner.nextDouble();

        System.out.print("Enter the gratuity rate (%): ");
        double gratuityRate = scanner.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.println("Gratuity: $" + gratuity);
        System.out.println("Total: $" + total);
    }
}
