public class Table {
	public static void main(String... args) {
		System.out.println("N\tN2\tN3\tN4");
		for (int number = 1; number <= 5; number++) {
			System.out.printf("%d\t%d\t%d\t%d%n", number, number * number, number * number * number, number * number * number * number);
		}
	}
}