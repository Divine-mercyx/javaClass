import java.util.Scanner;

public class SalesPercentage {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		double percent = 9 / 100;
		System.out.print("enter the item sold: ");
		double itemAmount = input.nextDouble();
		double part = itemAmount / percent;
		double pay = 200 + part;
		System.out.printf("the amount is: %f", pay);
 
	}
}