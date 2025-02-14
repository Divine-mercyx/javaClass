package missJenny.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                boolean continueLoop = true;
       
    
                
                do {
                    try {
                            
                        System.out.print("enter the numerator: ");
                        int numerator = input.nextInt();
                        System.out.println("the number is " + numerator);
                        continueLoop = false;
                    }
                
                    catch (InputMismatchException ex) {
                        System.out.println("incorrect input: an integer is required");
                        input.nextLine();
                    }
                } while (continueLoop);          
      
    }
}
