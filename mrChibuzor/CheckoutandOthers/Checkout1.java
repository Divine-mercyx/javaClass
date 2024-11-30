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
    
    public ArrayList<String>  displayQuestions(String name, ArrayList<String> product, ArrayList<Integer> itemsNumber, ArrayList<Double> itemPrice) {
        System.out.print("What did the user buy\n> ");
        /*String itemPurchased = input.nextLine();
        product.add(itemPurchased);*/
        
        System.out.print("How many peices\n> ");
        /*int number = input.nextInt();
        itemsNumber.add(number);*/
        
        System.out.println("How much per unit\n>");
        /*double howMuch = input.nextDouble();
        itemPrice.add(howMuch);*/
        
        return product;
    }
}
