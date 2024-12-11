import java.util.Arrays;

public class HugeInteger {

    int[] hugeInteger = new int[40];
    
    public HugeInteger(String number) {
        parse(number);
    }

    public void parse(String number) {
        for (int index = 0; index < number.length(); index++) {
            int temp = number.charAt(index) - '0';
            hugeInteger[39 - index] = temp;
        }
    }
    
    public String toString() {
        String number = "";
        for (int eachNumber : hugeInteger) {
            if (eachNumber != 0) {
            number += eachNumber;
            }
        }
        return number;
    }
    
    public int add(HugeInteger otherNumber) {
        int sum = 0;
        for (int index = 0; index < otherNumber.hugeInteger.length; index++) {
            sum += otherNumber.hugeInteger[index] + this.hugeInteger[index];
        }
        return sum;
    }
    
    
    public static void main(String... args) {
        HugeInteger example = new HugeInteger("0023");
        HugeInteger example2 = new HugeInteger("0023");
        int sum = example.add(example2);
        System.out.println(sum);
    }
}
