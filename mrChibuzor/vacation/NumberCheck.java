package mrChibuzor.vacation;
public class NumberCheck {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 78, 12, 45, 21};
        String number = checkNumber(numbers, 45);

        System.out.println(number);
    }

    public static String checkNumber(int[] numbers, int target) {
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return result += i;
            }
        }
        return "not available";
    }

    public static int[] checkNumberOfPositiveAndNegative(int[] numbers) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive++;
            }
            else if (numbers[i] == 0) {
                zero++;
            }
            else {
                negative++;
            }
        }
        int[] values = {positive, negative, zero};
        return values;
    }
}
