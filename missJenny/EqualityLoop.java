import java.util.Scanner;

public class EqualityLoop {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != -1) {

				System.out.println("enter three numbers: ");
				int numberOne = input.nextInt();
				int numberTwo = input.nextInt();
				int numberThree = input.nextInt();

				if (numberOne == numberTwo && numberOne == numberThree) {
					System.out.printf("%d, %d and %d are all the same%n", numberOne, numberTwo, numberThree);
					System.out.print("enter -1 to quit or 0 to continue: ");
					choice = input.nextInt();

				} else {
					System.out.printf("%d, %d and %d are all not the same%n", numberOne, numberTwo, numberThree);
					System.out.print("enter -1 to quit or 0 to continue: ");
					choice = input.nextInt();

	
				}
			
			
						
		}
	}
}