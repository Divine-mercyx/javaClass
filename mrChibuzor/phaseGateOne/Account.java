public class Account {

    private String firstName;
    private String lastName;
    private double balance;
    private String pin;
    private String accountNumber;
    
    public Account(String firstName, String lastName,  String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.balance = 0.0;
        this.accountNumber = generateAccountNumber();
        
    }
    
    
    public double balance() {
        return this.balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
        }
    }
    
    public void withdraw(double amount, String pin) {
        if (getPin().equals(pin)) {
            if (amount > 0.0 && amount < balance) {
                this.balance -= amount;
                System.out.println("$" + amount + " has been debited from your account");
            } else {
                System.out.println("insufficient funds");
            }
        } else {
            System.out.println("incorrect pin");
        }
    }
    
    public void transfer(Account recipient, Account person, double amount, String pin) {
        if (getPin().equals(pin)) {
            if (amount > 0.0 && amount < person.balance) {
                recipient.deposit(amount);
                person.balance -= amount;
            }
        } else {
                System.out.println("insufficient funds");
        }
    }
    
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getName() {
        return this.firstName + "  " + this.lastName;
    }
    
    
    public String getFirstName() {
        return this.firstName;
    }
    
    
    public String getPin() {
        return this.pin;
    }
    
    public String toString(){
        return "Name: " + getName() + "\nAccount number: " + accountNumber + "\nBalance : " + balance + " \npin : " +  pin + "\n";
    }
    
    public String generateAccountNumber() {
        String accountNumber = "";
        for (int index = 0; index <= 11; index++) {
            accountNumber += (int) (Math.random() * 10);
            if (accountNumber.length() == 11) break;
        }
        return accountNumber;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    

}
