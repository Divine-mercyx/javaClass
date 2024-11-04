import java.util.Scanner;

public class Palindrome {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number to check if its a palindrome: ");
		String number = input.nextLine();

		int numberReversed = 0;


		if (number.length() == 5) {
			int numbers = Integer.parseInt(number);

			int originalNumber = numbers;

			while (numbers > 0) {
				int remain = numbers % 10;
				numberReversed = numberReversed * 10 + remain; 
				numbers /= 10;
			} 

			if (numberReversed == originalNumber) {
				System.out.println("number is a palindrome.");
			} else {
				System.out.println("number is not a palindrome");
			}
		} 
		else {
			System.out.println("not a five digit number");
		}
	}
}