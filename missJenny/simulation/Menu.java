import java.util.Scanner;

public class Menu {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("""
			1) Add
			2) View
			3) Delete
			4) Quit
			""");
			choice = input.nextInt();
		} while(choice != 4);
	}
}