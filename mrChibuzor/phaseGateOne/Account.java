public class Account {

    private String firstName;
    private String lastName;
    private double balance;
    private String pin;
    
    public Account(String firstName, String lastName, double balance, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    
    
    public double balance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
            System.out.println("your account has been credited");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0.0 && amount < balance) {
            this.balance -= amount;
            System.out.println("your account has been debited");
        } else {
            System.out.println("insufficient funds");
        }
    }
    
    public void transfer(Account person, double amount) {
        if (amount > 0.0) {
            person.deposit(amount);
            this.balance -= amount;
        }
    }
    
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getName() {
        return firstName;
    }
    
    
    public String getPin() {
        return pin;
    }
    
    

}
