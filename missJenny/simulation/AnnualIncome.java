import java.util.Scanner;

public class AnnualIncome {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter annual income: ");
		int annualIncome = input.nextInt();

		if (annualIncome > 0 && annualIncome <= 9875) System.out.println("10%");
		else if (annualIncome >= 9876 && annualIncome <= 40125) System.out.println("12%");
		else if (annualIncome >= 40126 && annualIncome <= 85525) System.out.println("22%");
		else if (annualIncome >= 85526) System.out.println("24%");
	}
}