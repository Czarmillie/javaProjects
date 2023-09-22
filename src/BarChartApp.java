public class BarChartApp {
    public static void main(String[] args) {
        BarChartApp barChartApp = new BarChartApp();
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;

        for (int count = 1; count<= 5;){
            int userInput = barChartApp.input("Enter a number between 1 and 30");
            boolean isValidUserInput = barChartApp.isValidInput(userInput);
            if (isValidUserInput){
                switch (count){
                    case 1 -> firstNumber = userInput;
                    case 2 -> secondNumber = userInput;
                    case 3 -> thirdNumber = userInput;
                    case 4 -> fourthNumber = userInput;
                    case 5 -> fifthNumber = userInput;
                }
                count++;
            }
        }
    }

    private boolean isValidInput(int userInput) {
        return true;
    }

    public int input(String message) {
        return 0;
    }
}
