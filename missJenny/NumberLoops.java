import java.util.Scanner;

public class NumberLoops {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number: ");
		int choice = input.nextInt();

		for (int countA = choice; countA >= 1; countA--) {
			for (int counterA = 1; counterA <= countA; counterA++) {
				System.out.print(counterA + " ");
			}
			System.out.println();
		}
	}
}