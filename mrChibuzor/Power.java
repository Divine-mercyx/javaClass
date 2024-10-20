import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter first number: ");
		int first = input.nextInt();
		System.out.print("enter second number: ");
		int second = input.nextInt();
		int firstPower = Math.pow(first, second);
		System.out.println(firstPower);
	}
}
