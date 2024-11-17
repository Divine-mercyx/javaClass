public class Minimum {
    public static void main(String... args) {
        int[] numbers = {23, 45, 12, 78, 90};
        
        int smallest = numbers[0];
        
        for (int each : numbers) {
            if (each < smallest) {
                smallest = each;
            }
        }
        
        System.out.println("the smallest is " + smallest);
    }
}
