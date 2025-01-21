public class Triangle {
	public static void main(String... args) {
		int base = 6;
		int baseTwo = 1;

		System.out.println("pattern A");
		for (int i = 1; i <= base; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("pattern B");
		for (int y = 1; y <= base; y++) {
			for (int z = base; z >= y; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();


		System.out.println("pattern C");
		for (int a = base; a >= 1; a--) {
			for (int b = 1; b <= base - a; b++) {
				System.out.print(" ");
            		}
            
            		for (int c = 1; c <= a; c++) {
               			 System.out.print("*");
           		 }
			System.out.println();

		}
			System.out.println();


		System.out.println("pattern D");
		for (int d = 1; d <= base; d++) {
			for (int e = 1; e <= base - d; e++) {
				System.out.print(" ");
            		}
			for (int x = 1; x <= d; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();


		
	}
}