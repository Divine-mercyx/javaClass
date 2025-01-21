import java.util.Scanner;

public class FloatValue {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("input: ");
        float number = input.nextFloat();
        
        if (number == 0.0) {
            System.out.println("Zero");
        }
        
        if (number < 0.0) {
            System.out.println("Negative");
        }
        
        if (number > 0.0) {
            System.out.println("positive");
        }
        
        if (number < 1) {
            System.out.println("small");
        }
        
        if (number > 1000000) {
            System.out.println("large");
        }
    }
}
