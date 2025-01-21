import java.util.Scanner;

public class PositiveNegative {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		int numberOne = 0;

		while (numberOne != -1) {
			
			System.out.println("enter a numbers: ");
			numberOne = input.nextInt();
			if (numberOne != -1) {

			if (numberOne > 0) {
				System.out.printf("%d is positive%n", numberOne);
			} else if (numberOne < 0) {
				System.out.printf("%d is negative%n", numberOne);
			} else {
				System.out.printf("%d is zero%n", numberOne);
			}

			} else {
				System.out.println("youve exited");
			}

		}
	}
}