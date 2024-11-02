import java.util.Scanner;

public class Palindrome {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number to check if its a palindrome: ");
		int number = input.nextInt();

		int numberReversed = 0;
		int originalNumber = number;

		while (number > 0) {
			int remain = number % 10;
			numberReversed = numberReversed * 10 + remain; 
			number /= 10;
		} 

		if (numberReversed == originalNumber) {
			System.out.println("number is a palindrome.");
		} else {
			System.out.println("number is not a palindrome");
		}
	}
}