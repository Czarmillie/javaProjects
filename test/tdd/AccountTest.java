package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void canDepositIntoAccountTest() {
        Account estherAccount = new Account("2425");
        int currentBalance = estherAccount.getBalance("2425");
        assertEquals(0, currentBalance);

        estherAccount.deposit(5000);

        currentBalance = estherAccount.getBalance("2425");
        assertEquals(5000, currentBalance);


    }

    @Test
    public void canDepositTwiceTest() {
        Account estherAccount = new Account("2425");
        estherAccount.deposit(3000);
        int currentBalance = estherAccount.getBalance("2425");
        assertEquals(3000, currentBalance);

        estherAccount.deposit(2000);

        currentBalance = estherAccount.getBalance("2425");
        assertEquals(5000, currentBalance);
    }


    @Test
    public void cannotDepositNegativeAmountTest() {
        Account estherAccount = new Account("2425");
        estherAccount.deposit(1000);
        int currentBalance = estherAccount.getBalance("2425");
        assertEquals(1000, currentBalance);

        estherAccount.deposit(-2000);

        currentBalance = estherAccount.getBalance("2425");
        assertEquals(1000, currentBalance);
    }

    @Test
    public void canWithdrawTest() {
        Account estherAccount = new Account("2425");
        estherAccount.deposit(5000);
        int currentBalance = estherAccount.getBalance("2425");
        assertEquals(5000, currentBalance);

        estherAccount.withdraw(3000, "2425");

        currentBalance = estherAccount.getBalance("2425");
        assertEquals(2000, currentBalance);
    }

    @Test
    public void cannotWithdrawMoreMoneyTest() {
        Account estherAccount = new Account("2425");
        estherAccount.deposit(5000);
        int currentBalance = estherAccount.getBalance("2425");
        assertEquals(5000, currentBalance);

        estherAccount.withdraw(7000, "2425");

        currentBalance = estherAccount.getBalance("2425");
        assertEquals(5000, currentBalance);
    }

    @Test
    public void pinTest() {
        Account estherAccount = new Account("2425");
        estherAccount.deposit(5000);
        int currentBalance = estherAccount.getBalance("3725");
        assertEquals(0, currentBalance);

        estherAccount.withdraw(8000,"3725");
        currentBalance = estherAccount.getBalance("2425");
        assertEquals(5000, currentBalance);

    }
}

