import java.util.Scanner;

public class Medal {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter rank number: ");
		int number = input.nextInt();

		switch (number) {
			case 1: System.out.println("gold medal"); break;
			case 2: System.out.println("silver medal"); break;
			case 3: System.out.println("bronze medal"); break;
			case 4: System.out.println("participant"); break;
			default: System.out.println("invalid input");
		}
	}
}