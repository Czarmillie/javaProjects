import java.util.Scanner;
public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();
        int div = num % 3;
        if (div == 0)
        System.out.println("This number is divisible by 3. ");
        else{
            System.out.println("This number is not divisible by 3. ");
        }
    }
}