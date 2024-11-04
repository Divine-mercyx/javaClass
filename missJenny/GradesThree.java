import java.util.Scanner;

public class GradesThree {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a grade: ");
		int grades = input.nextInt();

		switch (grades) {
			case 50: System.out.println("C"); break;
			case 70: System.out.println("B"); break;
			case 100: System.out.println("A"); break;
			default: System.out.println("Well done"); break;
		}





	}
}