package ClassTaskOop;

public class User {

    private String name;
    private String email;
    private String number;


    public User(String name, String email, String number) {
        setName(name);
        setEmail(email);
        setNumber(number);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void viewAllRooms() {
        if (Hotel.rooms.size() > 0) {
            for (Room room : Hotel.rooms) {
                System.out.println(room);
            }
        }
        else {
            System.out.println("There is nothing to view");
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nEmail: " + getEmail() + "\nNumber: " + getNumber() + "\n";
    }
}
