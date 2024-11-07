import java.util.Scanner;
import java.util.Arrays;

public class Ayo {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		String[][] names = {

		{"esther", "tobi"}, 
	        {"ayo", "michael"}
		};

		for (int rows = 0; rows < names.length; rows++) {
			for (int column = 0; column < names[rows].length; column++) {
				System.out.printf("%s%n", names[rows][column]);
			}
		}
	}
}