import java.util.Scanner;

public class Equality {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter three numbers: ");
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		int numberThree = input.nextInt();

		if (numberOne == numberTwo && numberOne == numberThree) {
			System.out.printf("%d, %d and %d are all the same", numberOne, numberTwo, numberThree);
		} else {
			System.out.printf("%d, %d and %d are all not the same", numberOne, numberTwo, numberThree);
		}
	}
}