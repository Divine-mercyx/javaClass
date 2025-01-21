import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean condition = true;

		do {
			System.out.print("enter the first number: ");
			int number1 = input.nextInt();
			System.out.print("enter the second number: ");
			int number2 = input.nextInt();
			System.out.println(number1 + number2);
			System.out.print("do you want to do the operation again: 1(yes) / 2()no: ");
			int question = input.nextInt();
			if (question == 1) {
				condition = true;
			}
			else if (question == 2) {
				condition = false;
			}
			else {
				System.out.println("invalid command!");
				condition = false;
			}
		} while(condition);
	}
}