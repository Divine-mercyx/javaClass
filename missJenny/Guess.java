import java.util.Scanner;

public class Guess {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int guess = 0;
		int luckyGuess = (int) (Math.random() * 10);

		while (guess != luckyGuess) {
			System.out.print("guess a number: ");
			guess = input.nextInt();

			if (guess > luckyGuess) {
				System.out.println("to high!, try again");
			}

			else if (guess < luckyGuess) {
				System.out.println("too low, try again");
			}

			else if (guess == luckyGuess) {
				System.out.println("you won!");
			}
		}
		
	}
}