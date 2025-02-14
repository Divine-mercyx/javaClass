package missJenny.arrays;

public class Maximum1 {
    public static void main(String... args) {
        int[] numbers = {23, 45, 12, 78, 90};
        
        int largest = numbers[0];
        
        for (int each : numbers) {
            if (each > largest) {
                largest = each;
            }
        }
        
        System.out.println("the largest is " + largest);
    }
}
