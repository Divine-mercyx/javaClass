import java.util.Scanner;

public class SpecificValue {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {23, 45, 12, 78, 90};
        
        System.out.print("enter specific value: ");
        int specificValue = input.nextInt();
        
        System.out.println(checkSpecificValue(numbers, specificValue));
    }
    
    public static boolean checkSpecificValue(int[] array, int specificValue) {
        boolean status = false;
        for (int each : array) {
            if (each == specificValue) {
                status = true;
            }
        }
        
        return status;
    }
}
