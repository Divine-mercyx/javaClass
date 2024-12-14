import java.util.ArrayList;

public class Dairy {

    private ArrayList<DiaryEntry> entries;
    private boolean isLocked;
    
    public Dairy() {
        entries = new ArrayList<>();
        isLocked = false;
    }
    
    public void createNewEntry(String id, String content) {
        if (!isLocked) {
            entries.add(new DiaryEntry(id, content));
            System.out.println("added new entry");
        } else {
            System.out.println("Dairy is locked");
        }
    }
    
    public void createDiary() {
        System.out.println("new diary created");
    }
    
    public void unlock() {
        isLocked = false;
        System.out.println("dairy has been unlocked");
    }
    
    public void lock() {
        isLocked = true;
        System.out.println("dairy has been locked");
    }
    
    public DiaryEntry findEntryById(String id) {
        for (DiaryEntry entry : entries)  {
            if (entry.getId().equals(id)) {
                return entry;
            }
        }
        return null;
    }
    
    
    public void updateEntry(String id, String content) {
        DiaryEntry entry = findEntryById(id);
        if (entry != null && !isLocked) {
            entry.setContent(content);
            System.out.println("entry has been updated\nentry: " + content);
        } else {
            System.out.println("entry is null or diary is locked");
        }
    }
    
    public void deleteEntry(String id) {
        DiaryEntry entry = findEntryById(id);
        if (entry != null && !isLocked) {
            entries.remove(entry);
            System.out.println("entry has been deleted");
        } else {
            System.out.println("entry is null or diary is locked");
        }
    }
    
    
    public void viewEntry(String id) {
        DiaryEntry entry = findEntryById(id);
        if (entry != null && !isLocked) {
            System.out.printf("entry %s: %s", entry.getId(), entry.getContent());
        } else {
            System.out.println("entry is null or diary is locked");
        }
    }
}
