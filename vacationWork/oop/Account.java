public class Account {

    private String fullName;
    private String number;
    private String pin;
    private double balance = 0.0;
    private String accountNumber;
    
    
    public Account(String fullName, String number, String pin) {
        setFullName(fullName);
        setNumber(number);
        setPin(pin);
        this.accountNumber = generateAccountNumber();
    }
    
    
    public double getBalance() {
        return this.balance;
    }
    
    
    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
        }
        else {
            System.out.println("invalid amount");
        }
    }
    
    
    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= getBalance()) {
            this.balance -= amount;
        }
        else {
            System.out.println("insufficient funds");
        }
    }
    
    
    public void transfer(Account sender, Account recipient, double amount) {
        if (amount > 0.0 && amount <= sender.getBalance()) {
            recipient.deposit(amount);
            sender.withdraw(amount);
        } 
        else {
            System.out.println("insufficient funds");
        }
    }
    
    
    private void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    
    public String getFullName() {
        return fullName;
    }
    
    
    private void setNumber(String number) {
        this.number = number;
    }
    
    
    public String getNumber() {
        return number;
    }
    
    
    private void setPin(String pin) {
        this.pin = pin;
    }
    
    public String getPin() {
        return pin;
    }
    
    
    private String generateAccountNumber() {
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
    
    @Override
    public String toString(){
        return "Name: " + getFullName() + "\nAccount number: " + getAccountNumber() + "\nBalance : " + getBalance() + " \npin : " +  getPin() + "\n";
    }
    
}
