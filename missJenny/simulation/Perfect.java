import java.util.Scanner;

public class Perfect {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number to check if its a perfect number: ");
		int number = input.nextInt();
		getperfectNumber(number);
	}

	public static void getperfectNumber(int number) {
		int divisors = 0;

		for (int count = 1; count <= (number / 2); count++) {
			if (number % count == 0) {

				divisors += count;
			}
		}
		if (number == divisors) {
			System.out.println("perfect number");
		} else {
			System.out.println("not perfect");
		}
	}
}