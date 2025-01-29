package mrChibuzor.bankApp.src.myBankApp;

import java.util.Objects;

public class Account {

    private String fullname;
    private double balance;
    private String pin;
    private String accountNumber;

    public Account(String fullname, String pin, String accountNumber) {
        setFullname(fullname);
        setPin(pin);
        setAccountNumber(accountNumber);
    }


    public String getFullname() {
        return fullname;
    }

    private void setFullname(String fullname) {
        if (fullname == null || fullname.isEmpty()) {
            throw new IllegalArgumentException("Fullname cannot be null or empty");
        }
        this.fullname = fullname;
    }

    public double getBalance(String pin) {
        if (pin == null || pin.isEmpty()) throw new IllegalArgumentException("Pin cannot be null or empty");
        if (!Objects.equals(this.pin, pin)) throw new IllegalArgumentException("Pin does not match");
        return this.balance;
    }


    private void setPin(String pin) {
        if (pin == null || pin.isEmpty()) {
            throw new IllegalArgumentException("Pin cannot be null or empty");
        }
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("amount cannot be negatives");
        balance += amount;
    }

    public void withdraw(double amount, String pin) {
        if (Objects.equals(pin, this.pin)) {
            if (amount <= 0) throw new IllegalArgumentException("amount cannot be negatives");
            if (amount > balance) throw new IllegalArgumentException("amount cannot be greater than balance");
            balance -= amount;
        } else {
            throw new IllegalArgumentException("incorrect password");
        }
    }

    public void updatePassword(String currentPassword, String newPassword) {
        if (!Objects.equals(currentPassword, this.pin)) throw new IllegalArgumentException("incorrect password");
        this.pin = newPassword;
    }
}
