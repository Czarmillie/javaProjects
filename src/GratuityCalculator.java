import java.util.Scanner;

public class GratuityCalculator {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter subtotal: ");
        double subtotal = keyboardInput.nextDouble();

        System.out.print("Enter gratuity rate:" );
        double gratuityRate = keyboardInput.nextDouble();

        double gratuity = gratuityRate / subtotal;
        double total = gratuity + subtotal;

        System.out.printf("The Gratuity rate is $%.1f, and the total is $%.f", gratuity, total);

        }
    }
