import java.util.Scanner;

public class Factorials {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		int number = 5;
		int factorials = 1;

		for (int count = 1; count <= 5; count++) {
			factorials *= (number + 1) - count;
			System.out.print((number + 1) - count + " ");
		}
		System.out.println("factorial: " + factorials);
	}
}