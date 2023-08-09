import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        String validPassword = passwordValidator();
        System.out.println("Valid password: " + validPassword);
    }

    public static String passwordValidator() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a password: ");
            String password = scanner.nextLine();

            if (password.length() < 8) {
                System.out.println("Password should contain at least eight characters. ");
            } else if (!hasLowerCase(password)) {
                System.out.println("Password should contain at least one lowercase letter. ");
            } else if (!hasUpperCase(password)) {
                System.out.println("Password should contain at least one uppercase letter. ");
            } else if (!hasDigit(password)) {
                System.out.println("Password should contain at least one digit. ");
            } else if (!hasSpecialCharacters(password)) {
                System.out.println("Password should contain at least one special character. ");
            } else {
                System.out.println("Password is valid.");
                return password;
            }
        }
    }

    public static boolean hasLowerCase(String str) {
        return str.matches(".*[a-z].*");
    }

    public static boolean hasUpperCase(String str) {
        return str.matches(".*[A-Z].*");
    }

    public static boolean hasDigit(String str) {
        return str.matches(".*[0-9].*");
    }

    public static boolean hasSpecialCharacters(String str) {
        return str.matches(".*[^\\p{L}\\d\\s_].*");
    }
}