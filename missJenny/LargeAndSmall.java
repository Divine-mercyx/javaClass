import java.util.Scanner;

public class LargeAndSmall {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter -1 anytime to quit");
		System.out.print("enter a number: ");
		int choice = input.nextInt();

		int largest = choice;
		int smallest = choice;
		

		while (choice != -1) {
			if (choice != -1) {
			
			System.out.print("enter a number: ");
			choice = input.nextInt();


			if (choice > largest) {
				largest = choice;
			} 

			else if (choice < smallest && choice != -1) {
				smallest = choice;
			}
			}

		} 
		System.out.printf("largest: %d%nSmallest: %d%n", largest, smallest);
		
	}
}