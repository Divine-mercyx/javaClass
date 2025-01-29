package mrChibuzor.bankApp.tests.myBankApp;

import mrChibuzor.bankApp.src.myBankApp.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("divine boss", "abc", "1234");
    }

    @Test
    public void testAccountClass_ObjecttestAccount() {
        assertEquals("divine boss", account.getFullname());
        assertEquals("1234", account.getAccountNumber());
        assertEquals(0.0, account.getBalance("abc"));
    }

    @Test
    public void createAccount_addSpaceToFullName_addSpaceToPin_andAccountNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Account("divine boss", "", "1234"));
        assertThrows(IllegalArgumentException.class, () -> new Account("divine boss", null, "1234"));
        assertThrows(IllegalArgumentException.class, () -> new Account("", "abc", "1234"));
        assertThrows(IllegalArgumentException.class, () -> new Account(null, "abc", "1234"));
        assertThrows(IllegalArgumentException.class, () -> new Account("divine boss", "abc", ""));
        assertThrows(IllegalArgumentException.class, () -> new Account("divine boss", "", null));
    }


    @Test
    public void depositMoney_checkBalance_testAccount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-34));
        account.deposit(4000);
        assertEquals(4000, account.getBalance("abc"));
    }


    @Test
    public void depositMoney_withdrawMoney_testAccount() {
        account.deposit(4000);
        assertEquals(4000, account.getBalance("abc"));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(3000, "abcd"));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-3000, "abc"));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(4000, "abcd"));
        account.withdraw(3000, "abc");
        assertEquals(1000, account.getBalance("abc"));
    }


    @Test
    public void updatePassword_withdrawMoney_testAccount() {
        account.updatePassword("abc", "aaa");
        account.deposit(4000);
        assertEquals(4000, account.getBalance("aaa"));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(3000, "abc"));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(3000, null));
    }

}