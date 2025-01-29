package MyDairies;

import javax.swing.*;
import java.util.Scanner;

public class MainApplication {
    static Dairies dairies = new Dairies();
    static Dairy dairy;
    static Entry entry;
    public static void main(String[] args) {

        String prompt = """
                1 -> add
                2 -> find dairy
                3 -> delete
                """;
        char choice = input(prompt).charAt(0);
        switch (choice) {
            case '1' -> addDairies();
        }
    }

    private static void addDairies() {
        String fullname = input("enter your full name: ");
        String pin = input("enter your pin: ");
        try {
            dairies.addDairy(fullname, pin);
        } catch (Exception e) {
            prints(e.getMessage());
            displayMenu();
        } finally {
            prints("dairy created successfully");
            displayMenu();
        }
    }

    private static void displayMenu() {
        String prompt = """
                1 -> add
                2 -> find dairy
                3 -> delete
                """;
        String choice = input(prompt);
        switch (choice) {
            case "1" -> addDairies();
            case "2" -> findDairies();
            case "3" -> deleteDairies();
        }
    }

    private static void findDairies() {
        String fullname = input("enter your full name: ");
        try {
            dairy = dairies.findByUsername(fullname);
        } catch (Exception e) {
            prints(e.getMessage());
            displayMenu();
        } finally {
            prints("dairy found successfully");
            displayMenuForDairy();
        }
    }

    private static void displayMenuForDairy() {
        String prompt = """
                1 -> lock
                2 -> unlock
                3 -> check dairy status
                4 -> create entry
                5 -> delete entry
                6 -> find entry
                7 -> update entry
                8 -> exit
                """;
        String choice = input(prompt);
        switch (choice) {
            case "1" -> lockDairy();
            case "2" -> unlockDairy();
            case "3" -> checkStatus();
            case "4" -> createEntries();
            case "5" -> deleteEntries();
            case "6" -> findEntries();
            case "7" -> updateEntries();
            case "8" -> exitDairy();
        }
    }

    private static void updateEntries() {
        String id = input("enter the id of the entry you would like to update: ");
        String title = input("enter the title of the entry you would like to update: ");
        String body = input("enter the body of the entry you would like to update: ");
        try {
            dairy.updateEntryById(Integer.parseInt(id), title, body);
        } catch (Exception e) {
            prints(e.getMessage());
            displayMenuForDairy();
        } finally {
            prints("entry updated successfully");
            displayMenuForDairy();
        }
    }

    private static void findEntries() {
        String id = input("enter the id you want to find: ");
        try {
            entry = dairy.findEntryById(Integer.parseInt(id));
        } catch (Exception e) {
            prints(e.getMessage());
            displayMenuForDairy();
        } finally {
            prints("entry found successfully");
            prints(entry.toString());
        }
    }

    private static void deleteEntries() {
        String id = input("enter the id of the entry you want to delete: ");
        try {
            dairy.deleteById(Integer.parseInt(id));
        } catch (Exception e) {
            prints(e.getMessage());
            displayMenuForDairy();
        } finally {
            prints("dairy deleted successfully");
            displayMenuForDairy();
        }
    }

    private static void createEntries() {
        String title = input("enter the title: ");
        String body = input("enter the body: ");
        try {
            dairy.createEntry(title, body);
        } catch (Exception e) {
            prints(e.getMessage());
            displayMenuForDairy();
        } finally {
            prints("entry created successfully");
            displayMenuForDairy();
        }
    }

    private static void checkStatus() {
        prints(String.format("locked: %s", dairy.isLocked()));
        displayMenuForDairy();
    }

    private static void unlockDairy() {
        String pin = input("enter your pin: ");
        try {
            dairy.unlock(pin);
        } catch (Exception e) {
            prints(e.getMessage());
            displayMenuForDairy();
        } finally {
            prints("dairy unlocked successfully");
            displayMenuForDairy();
        }
    }

    private static void exitDairy() {
        prints("exiting... bye.");
        displayMenu();
    }

    private static void lockDairy() {
        prints("dairy locked successfully");
        dairy.lock();
        displayMenuForDairy();
    }

    private static void deleteDairies() {
        String fullname = input("enter your full name: ");
        String pin = input("enter your pin: ");
        try {
            dairies.deleteDairy(fullname, pin);
        } catch (Exception e) {
            prints(e.getMessage());
            displayMenu();
        } finally {
            prints("dairy deleted successfully");
            displayMenu();
        }
    }

    private static String input(String prompt) {
        return prints(prompt);
    }

    private static String prints(String prompt) {
        //Scanner scanner = new Scanner(System.in);
        return JOptionPane.showInputDialog(prompt);
    }


}
