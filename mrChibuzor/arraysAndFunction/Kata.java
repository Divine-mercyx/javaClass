public class Kata {
    
    public static boolean isEven(int number) {
        boolean status = false; 
        if (number % 2 == 0) status = true;
        return status;
    }
    
    
    public static boolean isPrime(int number) {
        boolean status = true;
        for (int count = 2; count < number; count++) if (number % count == 0) status = false;
        return status;
    }
    
    
    public static int substract(int numberOne, int numberTwo) {
        int result = numberOne - numberTwo;
        if (result < 0) result = (-1) * (result);
        return result;
    }
    
    
    public static float divide(int numberOne, int numberTwo) {
        if (numberTwo == 0.0) return 0;
        else return numberOne / numberTwo;
    }
    
    
    public static int factorOf(int number) {
        int counter = 0;
        for (int count = 1; count <= number; count++) if (number % count == 0) counter++;
        return counter;
    }
    
    
    public static boolean isSquare(int number) {
        boolean status = false;
        for (int count = 1; count < number; count++) if ((count * count) == number) status = true;
        return status;
    }
    
    
    public static boolean isPalindrome(int number) {
        boolean status = false;
        String[] values = getReversedAndOriginal(number);
        String reverse = values[0];
        String original = values[1];
        if (reverse.equals(original)) status = true;
        return status;
    }
    
    
    public static String[] getReversedAndOriginal(int number) {
        String reverse = "";
        String original = "";
        
        while (number > 0) {
            int remainder = number % 10;
            reverse = remainder + reverse;
            original += remainder;
            number = number / 10;
        }
        return new String[] {reverse, original};
    }
    
    
    public static long factorialOf(int number) {
        long factorial = 1;
        for (int count = number; number >= 1; count--) factorial *= count;
        return factorial;
    }
    
    
    public static long squareOf(int number) {
        return number * number;
    }
}
