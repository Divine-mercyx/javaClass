public class Diamond {
	public static void main(String... args) {

		for (int a = 1; a <= 7; a++) {
			for (int c = 1; c <= 7 - a; c++) {
				System.out.print(" ");
			}
			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		for (int w = 6; w >= 1; w--) {
			for (int y = 1; y <= 6 - w; y++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= w; x++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}