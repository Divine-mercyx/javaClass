public class Pyra {
	public static void main(String... args) {


		int totalRows = 7;
		for (int rows = 1; rows <= totalRows; rows++) {
			for (int space = 1; space <= totalRows - rows; space++) {
				System.out.print(" ");
			}

			for (int num = rows; num >= 1; num--) {
				System.out.print(num + "");
			}

			for (int num = 2; num <= rows; num++) {
				System.out.print(num + "");
			}
			System.out.println();
		}



		for (int rows = 6; rows >= 1; rows--) {
			for (int space = 1; space <= 7 - rows; space++) {
				System.out.print(" ");
			}
			for (int num = rows; num >= 1; num--) {
				System.out.print(num);
			}
			for (int num = 2; num <= rows; num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}


