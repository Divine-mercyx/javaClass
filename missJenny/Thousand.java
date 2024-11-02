public class Thousand {
	public static void main(String... args) {
		System.out.println("N\t10 * N\t100 * N\t1000 * N");
		for (int counter = 1; counter <= 5; counter++) {
			System.out.printf("%d\t%d\t%d\t%d\n", counter, counter * 10, counter * 100, counter * 1000);
		}
	}
}