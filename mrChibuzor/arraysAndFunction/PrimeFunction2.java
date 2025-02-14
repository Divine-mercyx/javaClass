package mrChibuzor.arraysAndFunction;

import java.util.Arrays;

public class PrimeFunction2 {
    public static void main(String... args) {
    
    
    int[] list = getPrimeList(40);
    System.out.printf(Arrays.toString(list));
    
    }
    
    public static int[] getPrimeList(int number) {
        int[] arrays = new int[getNumberOfPrimes(number)]; int count = 0;
        for (int index = 2; index < number; index++) if (isPrime(index)) arrays[count++] = index;
        return arrays;
    }
    
    public static int getNumberOfPrimes(int numberOne) {
        int count = 0;
        for (int number = 2; number < numberOne; number++) if (isPrime(number)) count++;
        return count;
    }
    
    
    public static boolean isPrime(int number) {
        boolean status = true;
        for (int count = 2; count < number; count++) if (number % count == 0) status = false;
        return status;
    }
}
