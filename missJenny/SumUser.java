import java.util.Scanner;

public class SumUser {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
			int first = 0;
			int second = 0;
			int choice = 0;

		do {
			if (choice  != -1) {
			System.out.println("enter two numbers to get the sum: ");
			first = input.nextInt();
			second = input.nextInt();
			System.out.println("sum: " + (first + second));
			System.out.println("do you want to continue? enter 0 to continue or -1 to quit: ");
			choice = input.nextInt();
			}
		} while (choice != -1);
	}
}