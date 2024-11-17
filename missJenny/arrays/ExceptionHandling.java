import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlings {
    
    /*public static int getQuotient(int numerator, int denominator) {
        throws ArithmeticException 
        {
            return numerator / denominator;
        }
    }*/


    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
        
        do {
            try {
                System.out.print("enter the numerator: ");
                int numerator = input.nextInt();
                System.out.print("enter the denominator: ");
                int denominator = input.nextInt();
                
                
                int result = getQuotient(numerator, denominator);
                System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
                continueLoop = false;
            
            } 
            
            catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                input.nextLine();
                System.out.println("\nyou must enter integers, try again");
            }
            
            catch (ArithmeticException arithmeticException) {
                System.err.printf("\nException: %s", arithmeticException);
                input.nextLine();
                System.out.println("\nzero is a invalid denominator, try again");
            }
        } while (continueLoop);
    }
    
    public static int quotient( int numerator, int denominator )
        throws ArithmeticException
        {
            return numerator / denominator; // possible division by zero 
        }
    }
}
