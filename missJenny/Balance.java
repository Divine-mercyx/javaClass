import java.util.Scanner;

public class Balance {
	public static void main(String... args) {
		Scanner input = new Scanner(Systsem.in);

		System.out.print("enter the account number: ");
		int accountNumber = input.nextInt();
		System.out.print("a new balance: ");
		int balance = input.nextInt();
		System.out.print("total of all items charged: ");
		int itemsCharged = input.nextInt();
		System.out.print("total of all credits applied to the customer this month: ");
		int totalCredits = input.nextInt();
		System.out.print("allowed credit limit: ");
		int creditLimit = input.nextInt();


		int newBalance = balance + itemsLargest - totalCredits;
		if (totalCredits > creditLimit) {
			System.out.println("exceeded credit limit");
		}
		System.out.println(newBalance);
	}
}