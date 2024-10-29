import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numberOne = 4;
		int numberTwo = 5;
		int numberThree = 44;

		int maximum = 0;
		if (numberOne > numberTwo && numberOne > numberThree)
			maximum = numberOne;
		else if (numberTwo > numberOne && numberTwo > numberThree)
			maximum = numberTwo;
		else if (numberThree > numberOne && numberThree > numberTwo)
			maximum = numberThree;

		System.out.printf("%d is the maximum"); 
	}
}