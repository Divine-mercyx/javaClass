public class User {

    private Dairy dairy;

    public User() {
        this.dairy = new Dairy();
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
}
