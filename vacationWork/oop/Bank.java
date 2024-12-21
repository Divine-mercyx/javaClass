import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Account> accounts;
    private String bankName;
    private String location;
    
    public Bank(String name, String location) {
        setBankName(name);
        setLocation(location);
        accounts = new ArrayList<>();
    }
    
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    
    public String getLocation() {
        return this.location;
    }
    
    
    public void setBankName(String name) {
        bankName = name;
    }
    
    
    public String getBankName() {
        return bankName;
    }
    
    
    public void welcomePage() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
        1. create account
        2. login to account
        3. exit
        """);
        System.out.print(":: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> createAccount();
            case 2 -> login();
            case 3 -> System.out.println("exited...");;
        }
    }
    
    public void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter full name: ");
        String fullName = input.nextLine();
        System.out.print("enter your telephone number: ");
        String number = input.nextLine();
        System.out.print("create your pin: ");
        String pin = input.nextLine();
        accountCreation(fullName, number, pin);
        
        login();
    }
    
    
    public void accountCreation(String fullName, String number, String pin) {
        Account account = new Account(fullName, number, pin);
        accounts.add(account);
        System.out.println(account);
    }
    
    
    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        String number = input.nextLine();
        System.out.print("enter pin: ");
        String pin = input.nextLine();
        boolean found = false;
        
        if (!accounts.isEmpty()) {
            for (Account account : accounts) {
                if (account.getPin().equals(pin) && account.getNumber().equals(number)) {
                    found = true;
                    displayAccountPage(account);
                    break;
                }
            }
             if (!found) {
                    System.out.println("incorrect number or pin");
                    welcomePage();
                }
        } else {
            System.out.println("no accounts");
        }
    }
    
    
    public void displayAccountPage(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
        Welcome to the homepage
        1. close account
        2. deposit money
        3. withdraw money
        4. check account balance
        5. transfer
        6. change pin
        7. logout
        """);
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> closeAccount(account);
            case 2 -> deposit(account);
            case 3 -> withdraw(account);
            case 4 -> checkBalance(account);
            case 5 -> transfer(account);
            case 6 -> changePin(account);
            case 7 -> logout();
        }
    }
    
    
    public void changePin(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter old pin: ");
        String oldPin = input.nextLine();
        System.out.print("enter new pin: ");
        String newPin = input.nextLine();
        if (account.getPin().equals(oldPin)) {
             account.setPin(newPin);
             System.out.println("pin updated");
             displayAccountPage(account);
        } else {
            System.out.println("incorrect pin");
            displayAccountPage(account);
        }
       
    }
    
    
    public void logout() {
        welcomePage();
    }
    
    
    public void transfer(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.print("choose the account number you want to transfer: ");
        String accountNumber = input.nextLine();
        Account recipient = getAccount(accountNumber);
        if (recipient != null) {
            System.out.print("enter amount: ");
            double amount = input.nextDouble();
            System.out.println();
            account.transfer(account, recipient, amount);
            displayAccountPage(account);
        } else {
            System.out.println("account does not exist");
            displayAccountPage(account);
        }
    }
    
    
    public Account getAccount(String number) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(number)) {
                return account;
            }
        }
        return null;
    }
    
    
    public void checkBalance(Account account) {
        System.out.println(account.getBalance());
        displayAccountPage(account);
    }
    
    
    public void withdraw(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter amount: ");
        double amount = input.nextDouble();
        account.withdraw(amount);
        displayAccountPage(account);
    }
    
    
    public void deposit(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter amount: ");
        double amount = input.nextDouble();
        account.deposit(amount);
        displayAccountPage(account);
    }
    
    
    public void closeAccount(Account account) {
        accounts.remove(account);
        welcomePage();
    }


    public static void main(String... args) {
        Bank bank = new Bank("first bank", "lagos");
        bank.welcomePage();
    }
}
