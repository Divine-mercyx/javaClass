package ClassTaskOop;

public class Admin extends User {

    private String password;

    public Admin(String username, String password, String email, String number) {
        super(username, email, number);
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}