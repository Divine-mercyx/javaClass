import java.util.Scanner;

public class LeapYear {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter the year: ");
		int year = input.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.printf("%d is a leap year%n", year);
		} else {
			System.out.printf("%d is not a leap year%n", year);
		}
	}
}