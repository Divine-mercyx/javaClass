import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> itemsBought = new ArrayList<>();
        ArrayList<Integer> itemsNo = new ArrayList<>();
        ArrayList<Double> itemPrice = new ArrayList<>();
        
        
        System.out.println("What is the customer's name\n>");
        String name = input.nextLine();
        displayQuestions(name, input, itemsBought, itemsNo, itemPrice);
        
    }
    
    public static void displayQuestions(String name, Scanner input, ArrayList<String> itemsBought, ArrayList<Integer> itemsNo, ArrayList<Double> itemPrice) {

        
        System.out.print("What did the user buy\n> ");
        String itemPurchased = input.nextLine();
        itemsBought.add(itemPurchased);
        
        System.out.print("How many peices\n> ");
        int itemsNumber = input.nextInt();
        itemsNo.add(itemsNumber);
        
        System.out.println("How much per unit\n>");
        double howMuch = input.nextDouble();
        itemPrice.add(howMuch);
        
        input.nextLine();
        System.out.println("Add more items?\n>");
        String option = input.nextLine();
        if (option.equalsIgnoreCase("yes")) {
            displayQuestions(name, input, itemsBought, itemsNo, itemPrice);
        } else {
        
        System.out.println("What is your name?\n>");
        String cashier = input.nextLine();
        
        System.out.println("How much discount will he get?\n>");
        double discount = input.nextDouble();
        
        displayCustomerInvoice(name, cashier, input, itemsBought, itemsNo, itemPrice, discount);
        }
    }
    
    
   public static void getPurchased(String name, Scanner input, ArrayList<String> itemsBought, ArrayList<Integer> itemsNo, ArrayList<Double> itemPrice) {
      displayQuestions(name, input, itemsBought, itemsNo, itemPrice);
  }
  
  public static void displayCustomerInvoice(String name, String cashier, Scanner input, ArrayList<String> itemsBought, ArrayList<Integer> itemsNo, ArrayList<Double> itemPrice, double discount) {
      System.out.println("""
      SEMICOLON STORES
      MAIN BRANCH
      LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
      TEL: 03293828343
      DATE: 18-DEC-22 8:48:11PM
      """);
      System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashier, name);
      System.out.println("======================================================");
      System.out.printf("%s\t%s\t%s\t%s", "Item", "QTY", "PRICE", "TOTAL");
      displayItems(input, itemsBought, itemsNo, itemPrice, discount);
  }
  
  public static void displayItems(Scanner input, ArrayList<String> itemsBought, ArrayList<Integer> itemsNo, ArrayList<Double> itemPrice, double discount) {

    double subTotal = 0.0;
      for (int index = 0; index < itemsBought.size(); index++) {
          System.out.printf("%n%s\t%d\t%.1f\t%.1f\n", itemsBought.get(index), itemsNo.get(index), itemPrice.get(index), (itemsNo.get(index) * itemPrice.get(index)));
          subTotal += itemsNo.get(index) * itemPrice.get(index);
      }
      double discountOne = discount / 100;
      double totalDiscount = subTotal * discountOne;
      double VAT = subTotal * (17.50 / 100);
      System.out.println("-----------------------------------------------------------------------------------");
      System.out.printf("subtotal: %.1f%nDiscount: %.1f%nVAT  @ 17.50: %.2f%n", subTotal, totalDiscount, VAT);
      System.out.println("------------------------------------------------------------------------------------");
      double billTotal = (subTotal - totalDiscount) + VAT;
      System.out.printf("Bill Total: %.2f%n", billTotal);
      System.out.println("------------------------------------------------------------------------------------");
      System.out.println("THIS IS NOT A RECIEPT KINDLY PAY " + billTotal);
      System.out.println("-------------------------------------------------------------------------------------");
      
      System.out.println("how much the customer give you?/n>");
      double payment = input.nextDouble();
      
      if (payment > billTotal) {
          displayItemsTwo(payment, itemsBought, itemsNo, itemPrice, discount);
      }
      else {
          System.out.println("not enough");
          
      }
  }
  
  public static void displayItemsTwo(double paid, ArrayList<String> itemsBought, ArrayList<Integer> itemsNo, ArrayList<Double> itemPrice, double discount) {
    System.out.println();
    System.out.println();
    System.out.println();
    double subTotal = 0.0;
      for (int index = 0; index < itemsBought.size(); index++) {
          System.out.printf("%n%s\t%d\t%.1f\t%.1f\n", itemsBought.get(index), itemsNo.get(index), itemPrice.get(index), (itemsNo.get(index) * itemPrice.get(index)));
          subTotal += itemsNo.get(index) * itemPrice.get(index);
      }
      discount = discount / 100;
      double totalDiscount = subTotal * discount;
      double VAT = subTotal * (17.50 / 100);
      System.out.println("-----------------------------------------------------------------------------------");
      System.out.printf("subtotal: %.1f%nDiscount: %.1f%nVAT  @ 17.50: %.2f%n", subTotal, totalDiscount, VAT);
      System.out.println("------------------------------------------------------------------------------------");
      double billTotal = (subTotal - totalDiscount) + VAT;
      System.out.printf("Bill Total: %.2f%n", billTotal);
      System.out.printf("Amount paid: %.2f%n", paid);
      double change = paid - billTotal;
      System.out.printf("Balance: %.2f", change);
      System.out.println("------------------------------------------------------------------------------------");
      
  }
}
