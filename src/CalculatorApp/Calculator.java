public class Calculator {

    public boolean isOn;

    private int result;

    public void power() {

    }

    public boolean isOn() {
        return true;
    }

    public int getAdd(){
        return result;
    }

    public void add(int firstNumber, int secondNumber) {
        result = firstNumber + secondNumber;
    }

    public int getResult(){
        return result;
    }

    public int getSubtract() {
        return result;
    }

    public void subtract(int firstNumber, int secondNumber) {
        result = firstNumber - secondNumber;
    }
}

