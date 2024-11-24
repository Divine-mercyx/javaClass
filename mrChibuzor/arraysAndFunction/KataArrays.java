public class KataArrays {

    public static int getLargest(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) if (number > largest) largest = number;
        return largest;
    }
    
    
    public static int[] reverseAList(int[] numbers) {
        int[] reverseNumbers = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) 
        reverseNumbers[numbers.length - index] = numbers[index];
        return reverseNumbers;
    }
    
    
    public static boolean checkOccurance(int[] numbers, int specialValue) {
        boolean status = false;
        for (int number : numbers) if (number == specialValue) status = true;
        return status;
    }
    
    
    public static void printOdds(int[] numbers) {
        for (int number : numbers) if (number % 2 != 0) System.out.println(number);
    }
    
    
    public static void printEven(int[] numbers) {
        for (int number : numbers) if (number % 2 == 0) System.out.println(number);
    }
    
    
    public static int getTotal(int[] numbers) {
        int total = 0;
        for (int number : numbers) total += number;
        return total;
    }
    
    
    public static boolean isPalindrome(String words) {
        boolean status = false;
        String reverse = "";
        for (int i = 0; i < words.length(); i++) reverse = words.charAt(i) + reverse;
        if (reverse == words) status = true;
        return status;
    }
    
    
    public static int getSumByWhile(int[] numbers) {
        int count = 0, total = 0;
        while (count < numbers.length) {
            total += numbers[count];
            count++;
        }
        return total;
    }
    
    
    public static int getSumByFor(int[] numbers) {
        int total = 0;
        for (int count = 0; count < numbers.length; count++) total += numbers[count];
        return total;
    }
    
    
    public static int getSumByDoWhile(int[] numbers) {
        int count = 0, total = 0;
        do {
            total += numbers[count];
            count++;
        } while (count < numbers.length);
        
        return total;
    }
    
    
    public static int[] getListOfDigits(String numbers) {
        int count = 0;
        int[] digits = new int[numbers.length()];
        int newNumber = Integer.parseInt(numbers);
        
        while (count < numbers.length()) {
            int remainder = newNumber % 10;
            newNumber = newNumber / 10;
            digits[numbers.length() - count] = remainder;
            count++;
        }
        return digits;
    }
    
}
