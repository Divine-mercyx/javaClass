public class NumbersPyramid {
	public static void main(String[] args) {

		




		for (int counter = 1; counter <= 7; counter++) {
			for (int count = 1; count <= counter; count++) {
				System.out.print(count);
			}
			System.out.println();
		}

		for (int counter = 6; counter >= 1; counter--) {
			for (int count = 1; count <= counter; count++) {
				System.out.print(count);
			}
			System.out.println();
		}
	}
}