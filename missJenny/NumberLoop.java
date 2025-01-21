import java.util.Scanner;

public class NumberLoop {
	public static void main(String... args) {
	Scanner input = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int choice = input.nextInt();

		for (int count = 1; count <= choice; count++) {
			for (int counter = 1; counter <= count; counter++) {
				System.out.print(counter);
			}

			System.out.println();
			
		}

		for (int countA = choice - 1; countA >= 1; countA--) {
			for (int counterA = 1; counterA <= countA; counterA++) {
				System.out.print(counterA);
			}
			System.out.println();
		}
	}
}