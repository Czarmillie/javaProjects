import java.util.Scanner;

public class Names{
    public static String getInitialsAndLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        String[] names = fullName.split(" ");
        StringBuilder initials = new StringBuilder();

        for (int i = 0; i < names.length - 1; i++) {
            initials.append(names[i].charAt(0)).append(". ");
        }
        String lastName = names[names.length - 1].substring(0, 1).toUpperCase() +
                names[names.length - 1].substring(1).toLowerCase();

        return initials.toString() + lastName;
    }
    public static void main(String[] args) {
        String result = getInitialsAndLastName();
        System.out.println("Name: " + result);
    }

    public static String getInitialsAndLastName(String input) {
        return input;
    }
}