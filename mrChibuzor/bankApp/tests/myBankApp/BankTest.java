package mrChibuzor.bankApp.tests.myBankApp;

import mrChibuzor.bankApp.src.myBankApp.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private Bank bank;


    @BeforeEach
    public void setUp() {
        bank = new Bank("first bank");
    }

    @Test
    public void testBankObject_testBank() {
        Bank bank = new Bank("zenith");
    }


    @Test
    public void createAccount_testBank() {
        bank.createAccount("divine boss", "abc");
        bank.createAccount("victor obinali", "abcd");
        assertThrows(IllegalArgumentException.class, () -> bank.createAccount("divine boss", ""));
        assertThrows(IllegalArgumentException.class, () -> bank.createAccount(null, "abcd"));
    }

    @Test
    public void createAccount_depositMoney_getAccountBalance_testBank() {
        bank.createAccount("divine boss", "abc");
        bank.createAccount("victor obinali", "abcd");
        bank.createAccount("esther obinali", "abcde");
        bank.deposit("1", 4000);
        assertEquals(4000, bank.checkBalance("1", "abc"));
        bank.deposit("1", 5000);
        assertEquals(9000, bank.checkBalance("1", "abc"));
    }

    @Test
    public void createAccount_depositMoney_withdrawMoney_checkBalance_testBank() {
        bank.createAccount("divine boss", "abc");
        bank.createAccount("victor obinali", "abcd");
        bank.deposit("1", 5000);
        bank.withdraw("1", 4000, "abc");
        assertEquals(1000, bank.checkBalance("1", "abc"));
        assertThrows(IllegalArgumentException.class, () -> bank.withdraw("1", 5000, "abc"));
        assertThrows(IllegalArgumentException.class, () -> bank.withdraw("10", 2000, "abc"));
    }

    @Test
    public void createAccount_depositMoney_transferMoney_testBank() {
        bank.createAccount("divine boss", "abc");
        bank.createAccount("victor obinali", "abcd");
        bank.deposit("1", 5000);
        bank.deposit("1", 5000);
        assertEquals(10000, bank.checkBalance("1", "abc"));
        bank.transfer("1", "2", 4500, "abc");
        assertEquals(4500, bank.checkBalance("2", "abcd"));
        assertEquals(5500, bank.checkBalance("1", "abc"));
    }
}