package MyDairies;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Dairies {
    private final ArrayList<Dairy> dairies;

    public Dairies() {
        dairies = new ArrayList<>();
    }


    public void addDairy(String fullname, String pin) {
        validateAddDairy(fullname, pin);
        dairies.add(new Dairy(fullname, pin));
    }

    private void validateAddDairy(String fullname, String pin) {
        Dairy dairy1 = new Dairy(fullname, pin);
        for (Dairy dairy : dairies) {
            if (dairy.getUsername().equals(dairy1.getUsername())) throw new NameAlreadyExistException("Name already exists");
        }

    }

    public Dairy findByUsername(String username) {
        validateDairyFind(username);
        for (Dairy dairy : dairies) {
            if (dairy.getUsername().equals(username)) return dairy;
        }
        throw new NoSuchElementException("not found");
    }


    public void deleteDairy(String username, String pin) {
        validateDairyFind(username);
        validateDairyFind(pin);
        dairies.removeIf(dairy -> dairy.getUsername().equals(username) && dairy.getPin().equals(pin));
    }

    private void validateDairyFind(String username) {
        if (dairies.isEmpty()) throw new NoSuchElementException("dairies is empty");
        if (username.isEmpty()) throw new NoSuchElementException("username is empty");
    }

}
