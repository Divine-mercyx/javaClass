import java.util.Scanner;

public class NormalPositiveNegativeCheck {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number: ");
		int numberOne = input.nextInt();
			if (numberOne > 0) {
				System.out.printf("%d is positive%n", numberOne);
			} else if (numberOne < 0) {
				System.out.printf("%d is negative%n", numberOne);
			} else if (numberOne == 0) {
				System.out.printf("%d is zero%n", numberOne);
			}

	}
}