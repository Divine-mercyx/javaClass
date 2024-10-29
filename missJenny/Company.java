import java.util.Scanner;

public class Company {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter the time taken: ");
		int timeTaken = input.nextInt();

		if (timeTaken >= 2 && timeTaken <= 3) {
			System.out.println("highly efficient");
		} 
		else if (timeTaken >= 3 && timeTaken <= 4) {
			System.out.println("improve speed");
		}
		else if (timeTaken >= 4 && timeTaken <= 5) {
			System.out.println("take training, to improve speed");
		}
		else if (timeTaken > 5) {
			System.out.println("youre fired, get out sluggard!");
		}
	}
}