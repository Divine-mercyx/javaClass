import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Account> accounts;
    
    public Bank() {
        accounts = new ArrayList<>();
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
            //case 3 ->;
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
    }
    
    
    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        String number = input.nextLine();
        System.out.print("enter pin: ");
        String pin = input.nextLine();
        
        if (accounts.size() != 0) {
            for (Account account : accounts) {
                if (account.getNumber().equals(number) && account.getPin().equals(pin)) {
                    displayAccountPage(account);
                } else {
                    System.out.println("incorrect number or pin");
                }
            }
        } else {
            System.out.println("no accounts");
        }
    }
    
    
    public void displayAccountPage(Account account) {
        System.out.println("""
        Welcome to the homepage
        """);
        welcomePage();
    }


    public static void main(String... args) {
        Bank bank = new Bank();
        bank.welcomePage();
    }
}
