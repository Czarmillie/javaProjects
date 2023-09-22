public class FactorialCalculator {

    public int calculateFactorial(){
        int number =0;
        boolean isNegativeNumber = number < 0;
        if (isNegativeNumber) terminate();
        boolean isNumberZeroOrOne = (number == 0 || number == 1);
        if (isNumberZeroOrOne) return 1;
        return number;
    }

    private void terminate() {
        System.out.println("Invalid input, number cannot be negative");
        System.exit(1);
    }
}
