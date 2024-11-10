import java.util.Scanner;

public class Even {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter two numbers: ");
		int first = input.nextInt();
		int second = input.nextInt();
		int sum = 0;
		if (second > first) {
			for (int count = first + 1; count <= second - 1; count++) {
				if (count % 2 == 0) {
					sum += count;
				}
			}
			System.out.println(sum);
		}
	}
}