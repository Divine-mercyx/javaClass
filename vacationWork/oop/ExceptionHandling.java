import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {


    public static int quotient(int x, int y) {
        return x / y;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("enter numerator: ");
                int numerator = input.nextInt();
                System.out.print("enter denominator: ");
                int denominator = input.nextInt();
                double result = quotient(numerator, denominator);
                System.out.println("result: " + result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Exception: " + inputMismatchException);
                input.nextLine();
                System.out.println("you must enter integers");
            }
            
            catch (ArithmeticException arithmeticException) {
                System.out.println("Exception: " + arithmeticException);
                input.nextLine();
                System.out.println("denominators should not be zero");
            }
        } while (continueLoop);
    }
}
