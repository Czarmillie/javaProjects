package Account;

import javax.swing.JOptionPane;
import java.util.Random;

public class BankMain {
    private static Bank bank;

    public static void main(String[] args) {
        bank = new Bank("Czar's", 10);

        JOptionPane.showMessageDialog(null, "Welcome to " + bank.getName());

        while (true) {
            int choice = getMenuChoice();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    checkAccountBalance();
                    break;
                case 6:
                    getNumberOfCustomers();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }

    private static int getMenuChoice() {
        String menu = "Bank Menu\n\n" +
                "1. Create Account\n" +
                "2. Deposit\n" +
                "3. Withdraw\n" +
                "4. Transfer\n" +
                "5. Check Account Balance\n" +
                "6. Get Number of Customers\n" +
                "7. Exit";
//        menu += "\n\n0. Go back to Main Menu";

        String userInput = JOptionPane.showInputDialog(null, menu + "\nEnter your choice:");
        if (userInput.equals("0")) {
            return 0;
        }
        return Integer.parseInt(userInput);
    }

    private static void createAccount() {
        String lastName = JOptionPane.showInputDialog("Enter last name (or 0 to go back):");
        if (lastName.equals("0")) {
            return;
        }
        String firstName = JOptionPane.showInputDialog("Enter first name (or 0 to go back):");
        if (firstName.equals("0")) {
            return;
        }

        String pin = "";
        String confirmPin = "";

        do {
            pin = JOptionPane.showInputDialog("Enter PIN:");
            confirmPin = JOptionPane.showInputDialog("Confirm PIN:");

            if (!pin.equals(confirmPin)) {
                JOptionPane.showMessageDialog(null, "PIN and confirmation do not match. Please try again.");
            }
        } while (!pin.equals(confirmPin));
        Random random = new Random();
        String accountNumber = String.format("%010d", random.nextInt(1000000000));

        bank.createAccountFor(lastName, firstName, pin);
        JOptionPane.showMessageDialog(null, "Account created successfully.\n" +
                "Account Number: " + accountNumber +
                "\nAccount Holder: " + firstName + " " + lastName);
    }

    private static void deposit() {
        String accountNumber = JOptionPane.showInputDialog("Enter account number:");
        int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter deposit amount:"));

        bank.deposit(amount, accountNumber);
        JOptionPane.showMessageDialog(null, "Deposit successful.");
    }

    private static void withdraw() {
        String accountNumber = JOptionPane.showInputDialog("Enter account number:");
        int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter withdrawal amount:"));
        String pin = JOptionPane.showInputDialog("Enter PIN:");

        bank.withdraw(amount, accountNumber, pin);
        JOptionPane.showMessageDialog(null, "Withdrawal successful.");
    }

    private static void transfer() {
        String senderAccountNumber = JOptionPane.showInputDialog("Enter account number:");
        String receiverAccountNumber = JOptionPane.showInputDialog("Enter recipient account number:");
        int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter transfer amount:"));
        String senderPin = JOptionPane.showInputDialog("Enter PIN:");

        bank.transfer(amount, senderAccountNumber, receiverAccountNumber, senderPin);
        JOptionPane.showMessageDialog(null, "Transfer successful.");
    }

    private static void checkAccountBalance() {
        String accountNumber = JOptionPane.showInputDialog("Enter account number:");

        if (accountNumber == null || accountNumber.isEmpty() || !accountNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Invalid account number.");
            return;
        }

        bank.checkAccountBalance(accountNumber);
    }

    private static void getNumberOfCustomers() {
        int numberOfCustomers = bank.getNumberOfCustomers();
        JOptionPane.showMessageDialog(null, "Number of customers: " + numberOfCustomers);
    }
}