import java.util.Scanner;

public class ThreeTimesCheck {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		int counter = 1;
		int numberOne = 0;

		while (counter <= 3) {
			System.out.print("enter a number: ");
			numberOne = input.nextInt();
			if (numberOne > 0) {
				System.out.printf("%d is positive%n", numberOne);
			} else if (numberOne < 0) {
				System.out.printf("%d is negative%n", numberOne);
			} else {
				System.out.printf("%d is zero%n", numberOne);
			}
			counter++;
		}
	}
}