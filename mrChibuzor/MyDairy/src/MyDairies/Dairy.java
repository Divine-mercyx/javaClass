package mrChibuzor.MyDairy.src.MyDairies;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Dairy {
    private String fullname;
    private boolean isLocked;
    private String pin;
    private ArrayList<Entry> entries;

    public Dairy(String fullname, String pin) {
        setFullname(fullname);
        entries = new ArrayList<>();
        this.isLocked = false;
        setPin(pin);
    }

    public void lock() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlock(String pin) {
        validatePin(pin);
        isLocked = false;
    }

    private void validatePin(String pin) {
        if (pin.isEmpty()) throw new IllegalArgumentException("Pin cannot be empty");
        if (pin == null) throw new NullPointerException("Pin cannot be null");
        if (!pin.equals(this.pin)) throw new IllegalArgumentException("Pin is not the same as the given pin");
    }

    public String getUsername() {
        if (isLocked()) throw new IllegalAccessError("Locked");
        return fullname;
    }

    private void setFullname(String fullname) {
        if (fullname.isEmpty()) throw new IllegalArgumentException("Fullname cannot be empty");
        if (fullname == null) throw new NullPointerException("Fullname cannot be null");
        this.fullname = fullname;
    }

    private void setPin(String pin) {
        if (pin.isEmpty()) throw new IllegalArgumentException("Pin cannot be empty");
        if (pin == null) throw new NullPointerException("Pin cannot be null");
        this.pin = pin;
    }

    public Entry createEntry(String title, String body) {
        validateCreationOfEntries(title, body);
        Entry entry = new Entry(++id, title, body);
        entries.add(entry);
        return entry;
    }

    private void validateCreationOfEntries(String title, String body) {
        if (title == null) throw new NullPointerException("Title cannot be null");
        if (body == null) throw new NullPointerException("Body cannot be null");
        if (body.isEmpty()) throw new IllegalArgumentException("Body cannot be empty");
        if (title.isEmpty()) throw new IllegalArgumentException("Title cannot be empty");
    }

    public int getSize() {
        return entries.size();
    }

    public Entry findEntryById(int i) {
        if (entries.isEmpty()) throw new NoSuchElementException("No entry found");
        for (Entry entry : entries) {
            if (entry.getId() == i) return entry;
        }
        throw new NoSuchElementException("Invalid id");
    }

    public void deleteById(int i) {
        if (isLocked()) throw new IllegalAccessError("Locked");
        Entry entry = findEntryById(i);
        entries.remove(entry);
    }

    public void updateEntryById(int i, String title, String body) {
        validateUpdateEntryById(i, title, body);
        Entry entry = findEntryById(i);
        entry.setTitle(title);
        entry.setBody(body);
    }

    private void validateUpdateEntryById(int i, String title, String body) {
        if (isLocked()) throw new IllegalAccessError("Locked");
        if (title == null) throw new NullPointerException("Title cannot be null");
        if (body == null) throw new NullPointerException("Body cannot be null");
        if (title.isEmpty()) throw new IllegalArgumentException("Title cannot be empty");
        if (body.isEmpty()) throw new IllegalArgumentException("Body cannot be empty");
    }

    public String getPin() {
        return pin;
    }
}