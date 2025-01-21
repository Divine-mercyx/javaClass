public class Natural {
	public static void main(String[] args) {
		int counter = 1;
		int sum = 0;
		while (counter <= 10) {
			sum += counter;
			counter++;
		}
		System.out.printf("the sum of all natural numbers is: %d", sum);
	}
}