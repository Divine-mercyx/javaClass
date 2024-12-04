import java.util.ArrayList;
import java.util.Scanner;

public class PhonebookApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhonebookApp person = new PhonebookApp();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();
        ArrayList<String> addresses = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        
        person.getQuestionsAndOptions(names, last, addresses, numbers, emails);
    }
    
    public String displayOptions() {
        System.out.println();
        String options = """
        1. Add Contact
        2. Remove Contact
        3. Find contact by phone number
        4. Find contact by first name
        5. Find contact by last name
        6. Edit contact
        """;
        
        return options;
    }
    

    public void getQuestionsAndOptions(ArrayList<String> names, ArrayList<String> last, ArrayList<String> addresses, ArrayList<String> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        String menu = displayOptions();
        System.out.println(menu);
        int options = input.nextInt();
        switch (options) {
            case 1: askContactsInfo(names, last, addresses, numbers, emails); break;
            case 2: removeContact(names, last, addresses, numbers, emails); break;
            case 3: findContact(names, last, addresses, numbers, emails); break;
            case 4: findContactFirstName(names, last, addresses, numbers, emails); break;
            case 5: findContactLastName(names, last, addresses, numbers, emails); break;
            case 6: editContacts(names, last, addresses, numbers, emails); break;
            default: System.out.println("invalid input.");
        }
    }
    
    
    
    public void askContactsInfo(ArrayList<String> names, ArrayList<String> last,ArrayList<String> addresses, ArrayList<String> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = input.nextLine();
        System.out.print("enter last name: ");
        String lastname = input.nextLine();
        System.out.print("enter address: ");
        String address = input.nextLine();
        String number = "0";
        do {
            System.out.print("enter number: ");
            number = input.nextLine();
            if (number.length() == 1)  System.out.println("try again");
        } while (number.length() == 1);
        System.out.print("enter email: ");
        String email = input.nextLine();
        input.nextLine();
        
        if (names.contains(name)) {
            System.out.println("name already exists");
        } else {
            names.add(name);
            last.add(lastname);
            addresses.add(address);
            numbers.add(number);
            emails.add(email);
        }
        getQuestionsAndOptions(names, last, addresses, numbers, emails); 
    }
    
    
    
    public void findContact(ArrayList<String> names, ArrayList<String> last, ArrayList<String> addresses, ArrayList<String> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number to find: ");
        String number = input.nextLine();
        if (!(numbers.isEmpty()) && numbers.contains(number)) {
            int index = numbers.indexOf(number);
            System.out.println("name: " + names.get(index) + "\nLastname: " + last.get(index) + "\naddress: " + addresses.get(index) + "\nnumber: " + numbers.get(index) + "\nemail: " + emails.get(index));
            getQuestionsAndOptions(names, last, addresses, numbers, emails); 
        }
        else {
            System.out.println("name does not exist, try again.");
            findContact(names, last, addresses, numbers, emails);
        }
    }
    
    
    public void editContacts(ArrayList<String> names, ArrayList<String> last, ArrayList<String> addresses, ArrayList<String> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter name of contact to edit: ");
        String name = input.nextLine();
        if (!(names.isEmpty()) && names.contains(name)) {
            int index = names.indexOf(name);
            System.out.print("change name: ");
            String change = input.nextLine();
            names.set(index, change);
            System.out.print("change last name: ");
            change = input.nextLine();
            last.set(index, change);
            System.out.print("change address: ");
            change = input.nextLine();
            addresses.set(index, change);
            System.out.print("change number: ");
            change = input.nextLine();
            numbers.set(index, change);
            System.out.print("change email: ");
            change = input.nextLine();
            emails.set(index, change);
            
            getQuestionsAndOptions(names, last, addresses, numbers, emails); 
        }
        else {
            System.out.println("name does not exist, try again.");
            editContacts(names, last, addresses, numbers, emails);
        }
    }
    
    
    
    public void findContactLastName(ArrayList<String> names, ArrayList<String> last, ArrayList<String> addresses, ArrayList<String> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter last name to find: ");
        String name = input.nextLine();
        if (!(last.isEmpty()) && last.contains(name)) {
            int index = last.indexOf(name);
            System.out.println("name: " + names.get(index) + "\nlastname: " + last.get(index) + "\naddress: " + addresses.get(index) + "\nnumber: " + numbers.get(index) + "\nemail: " + emails.get(index));
            getQuestionsAndOptions(names, last, addresses, numbers, emails); 
        }
        else {
            System.out.println("name does not exist, try again.");
            findContactLastName(names, last, addresses, numbers, emails);
        }
    }
    
    
    public void findContactFirstName(ArrayList<String> names, ArrayList<String> last, ArrayList<String> addresses, ArrayList<String> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter name to find: ");
        String name = input.nextLine();
        if (!(names.isEmpty()) && names.contains(name)) {
            int index = names.indexOf(name);
            System.out.println("name: " + names.get(index) + "\nlastname: " + last.get(index) + "\naddress: " + addresses.get(index) + "\nnumber: " + numbers.get(index) + "\nemail: " + emails.get(index));
            getQuestionsAndOptions(names, last, addresses, numbers, emails); 
        }
        else {
            System.out.println("name does not exist, try again.");
            findContactFirstName(names, last, addresses, numbers, emails);
        }
    }

    
    
    public void removeContact(ArrayList<String> names, ArrayList<String> last, ArrayList<String> addresses, ArrayList<String> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name to be removed: ");
        String name = input.nextLine();
        if (!(names.isEmpty()) && names.contains(name)) {
            int index = names.indexOf(name);
            names.remove(index);
            last.remove(index);
            addresses.remove(index);
            numbers.remove(index);
            emails.remove(index);
            System.out.print("contact have been deleted");
            getQuestionsAndOptions(names, last, addresses, numbers, emails); 
        } 
        else {
            System.out.println("name does not exist, try again.");
            removeContact(names, last, addresses, numbers, emails);
        }
    }
}
