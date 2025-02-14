package missJenny;

public class Pyramid {
	public static void main(String[] args) {
		
		for (int count = 1; count <= 7; count++) {
			int number = count;
			for (int counter = 1; counter <= 7 - count; counter++) {
				System.out.print(" ");
			}
			for (int countB = count; countB != 0; countB--) {
				System.out.print(number);
				number--;
			}
			number++;

			for (int countA = count; countA != 0; countA--) {
				System.out.print(number);
				number++;
			}
			number--;
			System.out.println();
		}
		
	}
}