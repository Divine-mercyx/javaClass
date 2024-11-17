import java.util.Scanner;

public class Occurance {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int[] number = {1,1,1,1,11,1,11,1};
        
        System.out.print("enter a number from 1 to 50: ");
        
        for (int range = 1; range <= 50; range++) {
            int counter = 0;
            int occur = 0;
            for (int count = 0; count < number.length; count++) {
                if (range == number[count]) {
                    counter += 1;
                    occur = range;
                }
            }
            System.out.println(occur + " occured " + counter + " times");
        }
    }
}
