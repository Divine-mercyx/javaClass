import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean condition = true;
		double largest = 0;
		double smallest = 0;


		while (condition) {
			System.out.print("enter a number: ");
			int number = input.nextInt();
			
			if (number > largest) {
				largest = number;
			} 
			else if (number < smallest) {
				smallest = number;
			}
			System.out.print("\ndo you want to continue 1 for(yes) / 2 for(no)");
			int question = input.nextInt();
			if (question == 1) {
				continue;
			}
			else if (question == 2) {
				break;
			} else {
				System.out.println("\ninvalid choice!");
			}
		}
		System.out.printf("the largest number is: %.0f%nthe smallest number is: %.0f", largest, smallest);
	}
}
