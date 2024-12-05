import java.util.Scanner;
import java.util.ArrayList;

public class AtmMachine {
    static Scanner input = new Scanner(System.in);
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
        int option = input.nextInt();
       switch (option) {
          case 1: /*createAccount();*/ break;
          case 2: login(); break;
          case 3: break;
          default: System.out.println("invalid input");
       }
    }
    
    public static Account login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LOGIN\n");
        System.out.print("enter name: ");
        String name = scanner.nextLine();
        System.out.print("enter password: ");
        String pin = scanner.nextLine();
        Account empty = new Account(null, null, 0, null);
        if (accounts.size() != 0) {
            for (Account account : accounts) {
                if (account.getName().equalsIgnoreCase(name) && account.getPin().equals(pin)) {
                     displayMenu(account);
                }
                else {
                    System.out.println("login unsucessful");
                    displayHomePage();
                }
            }
        }
        return empty;
    }
    
    
    public static void displayMenu(Account person) {
        System.out.println("""
        1. close account
        2. deposit money
        3. withdraw money
        4. check account balance
        5. transfer
        6. change pin
        """);
        int option = input.nextInt();
        switch (option) {
            case 1: closeAccount(person); break;
            case 2: depositMoney(person); break;
            case 3: withdraw(person); break;
            case 4: getBalance(person); break;
            case 5: transfer(person); break;
            case 6: break;
            default: System.out.println("invalid input");
        }
    } 
    
    
    /*public static void createAccount() {
            System.out.println("SIGNUP\n");
            System.out.print("enter you first name: ");
            String firstName = input.nextLine();
            input.nextLine();
            System.out.print("enter your last name: ");
            String lastName = input.nextLine();
            System.out.print("create your pin: ");
            String pin = input.nextLine();
            accounts.add(new Account(firstName, lastName, 0.0, pin));
            displayHomePage();
            
    }*/
    
    
    public static void transfer(Account person) {
        System.out.print("choose the account number you want to transfer: ");
        int accountNumber = input.nextInt();
        
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
        double amount = input.nextDouble();
        person.deposit(amount);
        System.out.println("account balance: " + person.balance());
        displayMenu(person);
    }
    
    
    public static void withdraw(Account person) {
        System.out.print("\nhow much you want to withdraw: ");
        double amount = input.nextDouble();
        person.withdraw(amount);
        System.out.println("account balance: " + person.balance());
        displayMenu(person);
    }
    

    
}
