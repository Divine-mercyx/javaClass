import java.util.Scanner;

public class Pyramid {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter number: ");
		int number = input.nextInt();

		for (int row = 1; row <= number; row++) {
			for (int space = 1; space <= number - row; space++) {
				System.out.print(" ");
			}

			for (int first = row; first >= 1; first--) {
				System.out.print(first);
			}

			for (int second = 2; second <= row; second++) {
				System.out.print(second);
			}
			System.out.println();
		}


		for (int rows = number - 1; rows >= 1; rows--) {
			for (int space = 1; space <= number - rows; space++) {
				System.out.print(" ");
			}
			for (int first = rows; first >= 1; first--) {
				System.out.print(first);
			}
			for (int second = 2; second <= rows; second++) {
				System.out.print(second);
			}
			System.out.println();
		}
	}
}