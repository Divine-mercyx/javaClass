import java.util.Scanner;

public class Encrypt {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a four digit number: ");
		String fourDigit = input.nextLine();
		int sum = 0;

		for (int number = 0; number < fourDigit.length(); number++) {
			int convert = Integer.valueOf(fourDigit.charAt(number) - '0');
			sum += (convert + 7) % 10;
			System.out.println(convert);
			
		}
		//int divideRemainder = sum % 10;
		//System.out.println(divideRemainder);

			System.out.println(sum);
	}
}