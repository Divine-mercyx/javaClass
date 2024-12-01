import java.util.ArrayList;
import java.util.Scanner;

public class Checkout1 {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        //int[] myarray = new int[];
        ArrayList<String> product = new ArrayList<>();
        ArrayList<Integer> itemsNumber = new ArrayList<>();
        ArrayList<Double> itemPrice = new ArrayList<>();
        
        
        
    }
    
    public ArrayList<String>  displayQuestions(Scanner input, String name, ArrayList<String> product, ArrayList<Integer> itemsNumber, ArrayList<Double> itemPrice) {
        System.out.print("What did the user buy\n> ");
        String itemPurchased = input.nextLine();
        product.add(itemPurchased);
        
        System.out.print("How many peices\n> ");
        int number = input.nextInt();
        itemsNumber.add(number);
        
        System.out.println("How much per unit\n>");
        double howMuch = input.nextDouble();
        itemPrice.add(howMuch);
        
        input.nextLine();
        System.out.println("Add more items?\n>");
        String option = input.nextLine();
        if (option.equalsIgnoreCase("yes")) {
            getPurchased(name, input, itemsBought, itemsNo, itemPrice);
        } else {
        
        System.out.println("What is your name?\n>");
        String cashier = input.nextLine();
        
        System.out.println("How much discount will he get?\n>");
        double discount = input.nextDouble();
    }
}
