// App.js
import React from 'react';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <BrowserRouter>
      <div className="container">
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/about">About</Link>
            </li>
          </ul>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

function Home() {
  return <h1>Welcome to the Home page!</h1>;
}

function About() {
  return <h1>Welcome to the About page!</h1>;
}

export default App;


import 'bootstrap/dist/css/bootstrap.min.css';


import java.util.ArrayList;  
import java.util.List;  

class DiaryEntry {  
    private String id;  
    private String content;  

    public DiaryEntry(String id, String content) {  
        this.id = id;  
        this.content = content;  
    }  

    public String getId() {  
        return id;  
    }  

    public String getContent() {  
        return content;  
    }  

    public void setContent(String content) {  
        this.content = content;  
    }  
}  

class Diary {  
    private List<DiaryEntry> entries;  
    private boolean locked;  

    public Diary() {  
        this.entries = new ArrayList<>();  
        this.locked = false;  
    }  

    public void createDiary() {  
        // Logic for creating a diary could be expanded here  
        System.out.println("Diary created.");  
    }  

    public void lockDiary() {  
        locked = true;  
        System.out.println("Diary locked.");  
    }  

    public void unlockDiary() {  
        locked = false;  
        System.out.println("Diary unlocked.");  
    }  

    public void addEntry(DiaryEntry entry) {  
        if (!locked) {  
            entries.add(entry);  
            System.out.println("Entry added: " + entry.getContent());  
        } else {  
            System.out.println("Diary is locked. Cannot add entry.");  
        }  
    }  

    public DiaryEntry findEntryById(String id) {  
        for (DiaryEntry entry : entries) {  
            if (entry.getId().equals(id)) {  
                return entry;  
            }  
        }  
        return null; // Entry not found  
    }  

    public void updateEntry(String id, String newContent) {  
        DiaryEntry entry = findEntryById(id);  
        if (entry != null && !locked) {  
            entry.setContent(newContent);  
            System.out.println("Entry updated: " + newContent);  
        } else {  
            System.out.println("Entry not found or diary is locked.");  
        }  
    }  

    public void deleteEntry(String id) {  
        DiaryEntry entry = findEntryById(id);  
        if (entry != null && !locked) {  
            entries.remove(entry);  
            System.out.println("Entry deleted: " + entry.getContent());  
        } else {  
            System.out.println("Entry not found or diary is locked.");  
        }  
    }  
}  

class User {  
    private Diary diary;  

    public User() {  
        this.diary = new Diary();  
    }  

    public void createDiary() {  
        diary.createDiary();  
    }  

    public void performActions() {  
        diary.unlockDiary();  
        diary.addEntry(new DiaryEntry("1", "My first entry."));  
        diary.updateEntry("1", "Updated my first entry.");  
        diary.lockDiary();  
        diary.addEntry(new DiaryEntry("2", "This won't be added."));  
    }  
}  

public class DiaryApplication {  
    public static void main(String[] args) {  
        User user = new User();  
        user.createDiary();  
        user.performActions();  
    }  
}




Certainly! Here’s a simplified version of the diary application in Java, along with explanations for each part. This version focuses on the core functionalities without any advanced features, making it easier to understand.

### Simplified Java Code

```java
import java.util.ArrayList;
import java.util.List;

class DiaryEntry {
    // Represents a single diary entry
    private String content;

    public DiaryEntry(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Diary {
    // List to hold diary entries
    private List<DiaryEntry> entries = new ArrayList<>();
    private boolean locked = false; // Diary lock status

    public void createEntry(String content) {
        if (!locked) {
            entries.add(new DiaryEntry(content));
            System.out.println("Entry added: " + content);
        } else {
            System.out.println("Diary is locked. Cannot add entry.");
        }
    }

    public void lockDiary() {
        locked = true;
        System.out.println("Diary locked.");
    }

    public void unlockDiary() {
        locked = false;
        System.out.println("Diary unlocked.");
    }

    public void viewEntries() {
        if (entries.isEmpty()) {
            System.out.println("No entries in the diary.");
        } else {
            System.out.println("Diary Entries:");
            for (DiaryEntry entry : entries) {
                System.out.println("- " + entry.getContent());
            }
        }
    }
}

class User {
    private Diary diary;

    public User() {
        diary = new Diary(); // Initialize the diary
    }

    public void addEntry(String content) {
        diary.createEntry(content);
    }

    public void lock() {
        diary.lockDiary();
    }

    public void unlock() {
        diary.unlockDiary();
    }

    public void viewDiary() {
        diary.viewEntries();
    }
}

public class SimpleDiaryApplication {
    public static void main(String[] args) {
        User user = new User();

        user.unlock(); // User unlocks the diary
        user.addEntry("My first entry."); // Add an entry
        user.addEntry("Today was great!"); // Add another entry
        user.lock(); // Lock the diary

        user.viewDiary(); // Try to view entries while diary is locked
    }
}
```

### Explanation of the Simplified Code

1. **DiaryEntry Class**:
   - This class represents a single diary entry.
   - It has one attribute, `content`, which stores the text of the entry.
   - The constructor initializes `content`, and there's a getter method to retrieve it.

2. **Diary Class**:
   - This class manages the diary entries.
   - It has a list, `entries`, to hold `DiaryEntry` objects.
   - The `locked` variable indicates whether the diary is locked.
   - **Methods**:
     - `createEntry(String content)`: Adds a new entry if the diary is unlocked. If locked, it prints a message preventing the addition.
     - `lockDiary()`: Locks the diary.
     - `unlockDiary()`: Unlocks the diary.
     - `viewEntries()`: Displays all diary entries if there are any.

3. **User Class**:
   - Represents the user who interacts with the diary.
   - Contains a `Diary` object.
   - **Methods**:
     - `addEntry(String content)`: Calls the diary's method to create an entry.
     - `lock()` and `unlock()`: Locks or unlocks the diary.
     - `viewDiary()`: Displays the diary entries by calling the corresponding method in the `Diary` class.

4. **SimpleDiaryApplication Class**:
   - The `main` method serves as the entry point of the application.
   - It creates a `User` and demonstrates typical interactions like unlocking the diary, adding entries, locking it, and viewing entries.

### Summary

This simplified version retains the core functionality of the diary application while being straightforward to understand. It highlights how basic object-oriented programming concepts such as classes, objects, and methods can be applied to build a simple diary management system.

