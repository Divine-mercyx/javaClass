public class MultiplicationTable {
	public static void main(String... args) {
		for (int counter = 1; counter <= 12; counter++) {
			for (int count = 2; count <= 20; count++) {
				System.out.print(count * counter + "\t");
			}
			System.out.println();
		}
	}
}