import java.util.Scanner;

public class Temperature {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter the temperature in celcius: ");
		int temperature = input.nextInt();

		if (temperature < 10) System.out.println("Cold");
		else if (temperature >= 10 && temperature <= 25) System.out.println("Warm");
		else if (temperature > 25) System.out.println("Hot");
	}
}