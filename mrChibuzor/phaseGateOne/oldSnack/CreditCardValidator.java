import java.util.Scanner;

public class  CreditCardValidator {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("enter card number: ");
        String number = input.nextLine();
        String status = checkNumberLength(number);
        String cardStatus = checkIfValid(number);
        
        
        System.out.println(getOfEvenAndOdd("4388576018402626"));
    }


    public static String checkNumberLength(String number) {
        String status = "invalid";
        if (number.length() >= 13 && number.length() <= 16) status = "valid";
        return status;
    }
    
    
    public static String checkIfValid(String number) {
        String status = "invalid";
        int sum = getSumOfEvenAndOdd(number);
        if (sum % 10 == 0) {
            status = "valid";
        }
        return status;
    }
    
    public static int getSumOfEvenAndOdd(String number) {
        //int number = Integer.parseInt(number);
        int odd = 0;
        int even = 0;
        for (int index = number.length() - 1; index > 0; index -= 2) {
            char character = number.charAt(index);
            odd += character - '0';
        }
        
        for (int index = number.length() - 2; index > -2; index -= 2) {
            String product = "";
            char character = number.charAt(index);
            int temp = character - '0';
            product += temp * 2;
            int temp4 = temp * 2;
            if (product.length() == 2) {
                temp = product.charAt(0) - '0';
                int temp2 = product.charAt(1) - '0';
                temp4 = temp + temp2;
            }
            even += temp4;
        }
        return even + odd;
    }
    
    public static String getCardType(String number) {
        String cardType = "";
        if (number.startsWith("4")) {
            cardType = "Visa Card";
        }
        else if (number.startsWith("5")) {
            cardType = "Master Card";
        }
        else if (number.startsWith("37")) {
            cardType = "American Express Card";
        }
        else if (number.startsWith("6")) {
            cardType = "Discover Card";
        }
        else {
            cardType = "invalid";
        }
        return cardType;
    }
}
