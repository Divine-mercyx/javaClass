import java.util.Scanner; 

public class Multiplication {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input number of terms: ");
		int number = input.nextInt();

		for (int i = 0; i <= number; i++) {
			int product = number * i;
			System.out.printf("%d x %d = %d%n", number, i, product);
		}
	}

}