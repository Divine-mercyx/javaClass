public class Loop {
	public static void main(String... args) {
		



		for (int count = 1; count <= 7; count++) {
			for (int space = 1; space <= 7 - count; space++) {
				System.out.print(" ");
			}
			for (int counter = 1; counter <= count; counter++) {
				System.out.print(counter);
			}

			for (int counter = 1; counter <= count; counter++) {
				System.out.print(counter);
			}

			System.out.println();
		}



		for (int count = 7; count >= 1; count--) {
			for (int space = 1; space <= 7 - count; space++) {
				System.out.print(" ");
			}
			for (int counter = 7; counter >= count; counter--) {
				System.out.print(counter);
			}

			for (int counter = 7; counter >= count; counter--) {
				System.out.print(counter);
			}

			System.out.println();
		}

	}
}