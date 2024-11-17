public class ArraySum {
    public static void main(String... args) {
        int[] numbers = {23, 45, 12, 78, 90};
        
        int sum = 0;
        
        for (int each : numbers) {
            sum += each;
        }
        
        System.out.println("the sum is " + sum);
    }
}
