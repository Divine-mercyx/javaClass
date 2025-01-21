import java.util.Scanner;

public class GradesTwo {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != -1) {
		System.out.print("enter a grade: ");
		int grades = input.nextInt();
		
		if (grades < 50)
			System.out.println("D");
		
		if (grades > 50 && grades < 60)
			System.out.println("C");

		if (grades > 60 && grades < 80)
			System.out.println("B");

		if (grades > 80 && grades <= 100)
			System.out.println("A");

		System.out.print("enter -1 to quit or 0 to continue");
		choice = input.nextInt();
		}
	}
}