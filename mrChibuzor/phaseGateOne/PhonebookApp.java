import java.util.ArrayList;
import java.util.Scanner;

public class PhonebookApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhonebookApp person = new PhonebookApp();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> addresses = new ArrayList<>();
        ArrayList<Long> numbers = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        
        person.getQuestionsAndOptions(names, addresses, numbers, emails);
    }
    
    public String displayOptions() {
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
    

    public void getQuestionsAndOptions(ArrayList<String> names, ArrayList<String> addresses, ArrayList<Long> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        String menu = displayOptions();
        System.out.println(menu);
        int options = input.nextInt();
        switch (options) {
            case 1: askContactsInfo(names, addresses, numbers, emails); break;
            case 2: removeContact(names, addresses, numbers, emails); break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            default: System.out.println("invalid input.");
        }
    }
    
    
    
    public void askContactsInfo(ArrayList<String> names, ArrayList<String> addresses, ArrayList<Long> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = input.nextLine();
        System.out.print("enter address: ");
        String address = input.nextLine();
        long number = 0;
        do {
            System.out.print("enter number: ");
            number = input.nextLong();
        } while (number <= 0);
        System.out.print("enter email: ");
        String email = input.nextLine();
        input.nextLine();
        
        names.add(name);
        addresses.add(address);
        numbers.add(number);
        emails.add(email);
        getQuestionsAndOptions(names, addresses, numbers, emails); 
    }
    
    
    
    public void findContact(ArrayList<String> names, ArrayList<String> addresses, ArrayList<Long> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number to find: ");
        long number = input.nextLong();
        if (!(number.isEmpty()) && numbers.contains(number)) {
            int index = numbers.indexOf(number);
            System.out.println();
        }
    }

    
    
    public void removeContact(ArrayList<String> names, ArrayList<String> addresses, ArrayList<Long> numbers, ArrayList<String> emails) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name to be removed: ");
        String name = input.nextLine();
        if (!(names.isEmpty()) && names.contains(name)) {
            int index = names.indexOf(name);
            names.remove(index);
            addresses.remove(index);
            numbers.remove(index);
            emails.remove(index);
            System.out.print("contact have been deleted");
        } 
        else {
            System.out.println("name does not exist, try again.");
            removeContact(names, addresses, numbers, emails);
        }
    }
}
