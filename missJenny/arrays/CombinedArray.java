import java.util.Arrays;

public class CombinedArray {
    public static void main(String... args) {
        int[] firstList = {1, 2, 3};
        int[] secondList = {4, 5, 6, 7, 8, 9, 10};
        
        int[] array = combineArray(firstList, secondList);
        System.out.println(Arrays.toString(array));
        
        
    }
    
    public static int[] combineArray(int[] first, int[] second) {
        int[] combined = new int[first.length + second.length];
        int count = 0;
        
        for (int counter = 0; counter < first.length; counter++) {
            combined[counter] = first[counter];
        }
        
        for (int counter = 0; counter < second.length; counter++) {
            combined[count + 3] = second[counter];
        }
        
        return combined;
    }
}
