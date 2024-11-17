import java.util.Arrays;

public class ArrayReversed {
    public static void main(String... args) {
        int[] firstList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newList = new int[firstList.length];
        
        for (int counter = firstList.length - 1; counter >= 0; counter--) {
            int index = (firstList.length - 1) - counter;
            newList[index] = firstList[counter];
        }
        System.out.println(Arrays.toString(newList));
    }
}
