import java.util.Scanner;

    public class MenuApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Main Menu:");
                System.out.println("1. Phone book");
                System.out.println("2. Messages");
                System.out.println("3. Chat");
                System.out.println("4. Call register");
                System.out.println("5. Tones");
                System.out.println("6. Settings");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                System.out.println();

                switch (choice) {
                    case 1 -> phoneBookMenu();
                    case 2 -> messagesMenu();
                    case 3 -> chatMenu();
                    case 4 -> callRegisterMenu();
                    case 5 -> tonesMenu();
                    case 6 -> settingsMenu();
                    case 7 -> callDivertMenu();
                    case 8 -> gamesMenu();
                    case 9 -> calculatorMenu();
                    case 10-> remindersMenu();
                    case 11-> clockMenu();
                    case 12-> profilesMenu();
                    case 13 -> {
                        simServicesMenu();

                        {
                            System.out.println("Exiting the program...");
                            return;
                        }
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
                System.out.println();
            }
        }

        private static void profilesMenu() {

        }

        private  static void simServicesMenu(){

        }

        private static void clockMenu() {

        }

        private static void remindersMenu() {

        }

        private static void calculatorMenu() {

        }

        private static void gamesMenu() {

        }

        private static void callDivertMenu() {

        }

        public static void phoneBookMenu() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Phone Book Menu:");
                System.out.println("1. Search");
                System.out.println("2. Service Nos. 1");
                System.out.println("3. Add name");
                System.out.println("4. Erase");
                System.out.println("5. Edit");
                System.out.println("6. Assign tone");
                System.out.println("7. Send b'card");
                System.out.println("8. Options");
                System.out.println("9. Speed dials");
                System.out.println("10. Voice tags");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        // Handle search logic
                        break;
                    case 2:
                        // Handle service numbers logic
                        break;
                    case 3:
                        // Handle adding a name logic
                        break;
                    case 4:
                        // Handle erase logic
                        break;
                    case 5:
                        // Handle edit logic
                        break;
                    case 6:
                        // Handle assigning tone logic
                        break;
                    case 7:
                        // Handle sending b'card logic
                        break;
                    case 8:
                        optionsMenu();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            }
        }

        public static void optionsMenu() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Options Menu:");
                System.out.println("1. Type of view");
                System.out.println("2. Memory status");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                System.out.println();

                // Handle the choices accordingly
                switch (choice) {
                    case 1:
                        // Handle type of view logic
                        break;
                    case 2:
                        // Handle memory status logic
                        break;
                    case 3:
                        // Handle speed dials logic
                        break;
                    case 4:
                        // Handle voice tags logic
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            }
        }

        public static void messagesMenu() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Messages Menu:");
                System.out.println("1. Write messages");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Picture messages");
                System.out.println("5. Templates");
                System.out.println("6. Smileys");
                System.out.println("7. Message settings");
                System.out.println("8. Info service");
                System.out.println("9. Voice mailbox number");
                System.out.println("10. Service command editor");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                System.out.println();

                // Handle the choices accordingly
                switch (choice) {
                    case 1:
                        // Handle write messages logic
                        break;
                    case 2:
                        // Handle inbox logic
                        break;
                    case 3:
                        // Handle outbox logic
                        break;
                    case 4:
                        // Handle picture messages logic
                        break;
                    case 5:
                        // Handle templates logic
                        break;
                    case 6:
                        // Handle smileys logic
                        break;
                    case 7:
                        messageSettingsMenu();
                        break;
                    case 8:
                        // Handle info service logic
                    case 9:
                        // Handle voice mailbox number logic
                    case 10:
                        // Handle service command editor logic
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            }
        }

        public static void messageSettingsMenu() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Message Settings Menu:");
                System.out.println("1. Set 12");
                System.out.println("2. Common 3");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                System.out.println();

                // Handle the choices accordingly
                switch (choice) {
                    case 1:
                        // Handle set 12 logic
                        break;
                    case 2:
                        common3Menu();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            }
        }

        public static void common3Menu() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Common 3 Menu:");
                System.out.println("1. Delivery reports");
                System.out.println("2. Reply via same centre");
                System.out.println("3. Character support");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                System.out.println();

                // Handle the choices accordingly
                switch (choice) {
                    case 1:
                        // Handle delivery reports logic
                        break;
                    case 2:
                        // Handle reply via same centre logic
                        break;
                    case 3:
                        // Handle character support logic
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            }
        }

        public static void chatMenu() {
            // Implement chat menu logic
        }

        public static void callRegisterMenu() {
            // Implement call register menu logic
        }

        public static void tonesMenu() {
            // Implement tones menu logic
        }

        public static void settingsMenu() {
            // Implement settings menu logic
        }
    }


