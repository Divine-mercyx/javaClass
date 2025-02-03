package mrChibuzor.bankApp.src.myBankApp;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;
    private String bankName;
    private int counter;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }


    public void createAccount(String fullname, String pin) {
        accounts.add(new Account(fullname, pin, generateAccountNumber()));
    }

    private String generateAccountNumber() {
        String number = "";
        ++counter;
        number += counter;
        return number;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account == null) throw new IllegalArgumentException();
        if (amount < 0) throw new IllegalArgumentException();
        account.deposit(amount);
    }

    private Account findAccount(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) throw new IllegalArgumentException("Invalid account number");
        if (accounts.isEmpty()) throw new IllegalArgumentException("No account found");
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) return account;
        }
        return null;
    }

    public double checkBalance(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        if (account == null) throw new IllegalArgumentException();
        return account.getBalance(pin);
    }

    public void withdraw(String accountNumber, double amount, String pin) {
        Account account = findAccount(accountNumber);
        if (account == null) throw new IllegalArgumentException();
        account.withdraw(amount, pin);
    }

    public void transfer(String sender, String recipient, int amount, String pin) {
        if (sender.equals(recipient)) throw new IllegalArgumentException("sender is the same as recipient");
        Account senderAccount = findAccount(sender);
        Account recipientAccount = findAccount(recipient);
        if (senderAccount == null || recipientAccount == null) throw new IllegalArgumentException();
        senderAccount.withdraw(amount, pin);
        recipientAccount.deposit(amount);
    }
}
