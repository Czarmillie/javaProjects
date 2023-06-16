package tdd;

public class Account {

    private final String PIN;
    private int balance;

    public Account(String pin) {
        this.PIN = pin;
    }


    public int getBalance(String pin) {
        if (PIN != pin) return 0;
        return balance;
    }

    public void deposit(int amount) {
        if (amount >= 1)
            balance = balance + amount;
    }

    public void withdraw(int amount, String pin) {

        if (amount > balance) return;
        if (PIN == pin) {
            balance = balance - amount;
        }
        if (PIN != pin) {

        }


    }
    }