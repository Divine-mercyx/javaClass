import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter two decimal numbers: ");
		double first = input.nextDouble();
		double second = input.nextDouble();

		int firstOne = (int) first;
		int secondOne = (int) second;

		double numberOne = first - firstOne;
		double numberTwo = second - secondOne;

		if (numberOne == numberTwo) {
			System.out.printf("the two decimal numbers are the same %.3f and %.3f%n", numberOne, numberTwo);
		} else {
			System.out.printf("the two decimal numbers are not the same| %.3f and %.3f", numberOne, numberTwo);
		}
	}
}