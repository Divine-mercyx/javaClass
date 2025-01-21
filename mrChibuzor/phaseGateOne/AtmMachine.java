import java.util.Scanner;
import java.util.ArrayList;

public class AtmMachine {
    static Scanner strings = new Scanner(System.in);
    static Scanner integers = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();

    
    public static void main(String[] args) {
        displayHomePage();
        
    }
    
    public static void displayHomePage() {
        System.out.println("""
        welcome to semicolon atm machine
        Do you want to create an account ?
        1. create account
        2. login
        3. exit
        """);
        int option = integers.nextInt();
       switch (option) {
          case 1: createAccount(); break;
          case 2: login(); break;
          case 3: break;
          default: System.out.println("invalid input");
       }
    }
    
    public static void login() {
        System.out.println("LOGIN\n");
        System.out.print("enter name: ");
        String name = strings.nextLine();
        System.out.print("enter password: ");
        String pin = strings.nextLine();
        if (accounts.size() != 0) {
            for (Account account : accounts) {
                if (account.getFirstName().equalsIgnoreCase(name) && account.getPin().equals(pin)) {
                     displayMenu(account);
                }
            }
            displayHomePage();
        }
    }
    
    
    public static void displayMenu(Account person) {
        System.out.println("""
        \n1. close account
        2. deposit money
        3. withdraw money
        4. check account balance
        5. transfer
        6. change pin
        7. logout
        """);
        int option = integers.nextInt();
        switch (option) {
            case 1: closeAccount(person); break;
            case 2: depositMoney(person); break;
            case 3: withdraw(person); break;
            case 4: getBalance(person); break;
            case 5: transfers(person); break;
            case 6: break;
            case 7: logout(); break;
            default: System.out.println("invalid input");
        }
    } 
    
    
    public static void logout() {
        displayHomePage();
    }
    
    
    public static void createAccount() {
            System.out.println("SIGNUP\n");
            System.out.print("enter you first name: ");
            String firstName = strings.nextLine();
            System.out.print("enter your last name: ");
            String lastName = strings.nextLine();
            System.out.print("create your pin: ");
            String pin = strings.nextLine();
            Account account = new Account(firstName, lastName, pin);
            System.out.print(account);
            accounts.add(account);
            login();
            
    }
    
    
    public static void transfers(Account person) {
        System.out.print("choose the account number you want to transfer: ");
        String accountNumber = strings.nextLine();
        getAccountByNumber(accountNumber, person);
        displayMenu(person);
    }
    
    public static void getAccountByNumber(String number, Account person) {
        
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(number)) {
                displayDetails(account, person);
            }
        }
    }
    
    public static void displayDetails(Account recipient, Account person) {
        System.out.println(recipient);
        System.out.print("how much do you want to transfer to " + recipient.getName() + ": ");
        double amount = integers.nextInt();
        System.out.print("enter your pin: ");
        String pin = strings.nextLine();
        person.transfer(recipient, person, amount, pin);
    }
    
    
    public static void closeAccount(Account person) {
        accounts.remove(person);
        System.out.println("account deleted...");
        displayHomePage();
    }
    
    
    public static void getBalance(Account person) {
        System.out.print("\naccount balance: " + person.balance());
        displayMenu(person);
        System.out.println();
    }
    
    
    public static void depositMoney(Account person) {
        System.out.print("\nhow much do you want to deposit: ");
        double amount = integers.nextDouble();
        person.deposit(amount);
        System.out.println("account balance: " + person.balance());
        displayMenu(person);
    }
    
    
    public static void withdraw(Account person) {
        System.out.print("\nhow much you want to withdraw: ");
        double amount = integers.nextDouble();
        System.out.print("enter you pin: ");
        String pin = strings.nextLine();
        person.withdraw(amount, pin);
        System.out.println("account balance: " + person.balance());
        displayMenu(person);
    }
    

    
}
