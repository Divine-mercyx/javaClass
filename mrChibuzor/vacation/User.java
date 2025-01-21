package mrChibuzor.vacation;

public class User {

    private Dairy dairy;
    private String firstName;
    private String lastName;

    public User(String first, String last) {
        setFirstName(first);
        setLastName(last);
        this.dairy = new Dairy();
    }
    
    public void setFirstName(String first) {
        if (first != null && first.length() != 0) {
            firstName = first;
        }
        else {
            throw new IllegalArgumentException("first name is either null or it is an empty string");
        }
    }
    
    public void setLastName(String last) {
        if (last != null && last.length() != 0) {
            lastName = last;
        }
        else {
            throw new IllegalArgumentException("last name is either null or it is an empty string");
        }
    }
    
    public void createDairy() {
        dairy.createDiary();
    }
    
    public void addNewEntry(String id, String content) {
        dairy.createNewEntry(id, content);
    }
    
    public void lockDiary() {
        dairy.lock();
    }
    
    public void unlock() {
        dairy.unlock();
    }
    
    public void updateEntry(String id, String content) {
        dairy.updateEntry(id, content);
    }
    
    public void deleteEntryById(String id) {
        dairy.deleteEntry(id);
    }
    
    public void findEntry(String id) {
        dairy.viewEntry(id);
    }

    public void viewEntry(String id) {
        dairy.viewEntry(id);
    }
}
