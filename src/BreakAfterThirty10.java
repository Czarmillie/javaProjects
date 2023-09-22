import java.util.Scanner;

public class BreakAfterThirty10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Scores between 0 and 100: ");
        int sum = 0;
        int count = 0;
        while (count < 10) {
            System.out.print("Scores " + (count + 1) + ": ");
            int userInput = scanner.nextInt();
            sum += userInput;
            count++;
            if (userInput == 30){
                count = 0;
            }
        }
        System.out.println("The sum of the 10 valid numbers is: " + sum);
    }
}