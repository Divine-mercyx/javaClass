import java.util.Scanner;

public class Course {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.println("""
		1. Math
		2. Science
		3. History
		enter your course: 
		""");

		String course = input.nextLine();

		switch (course.toLowerCase()) {
			case "math":
				System.out.print("""
				1. Freshman
				2. Sophomore
				3. junior
				4. senior
				enter your year: 
				""");
				String year = input.nextLine();
				switch (year.toLowerCase()) {
					case "freshman": System.out.println("mr uzochukwu"); break;
					case "sophomore": System.out.println("mr leke big head"); break;
					case "junior": System.out.println("prof boss olumide"); break;
					case "senior": System.out.println("miss black christiana"); break;
					default: System.out.println("invalid stuff");
				} break;



			case "science":
				System.out.print("""
				1. Freshman
				2. Sophomore
				3. junior
				4. senior
				enter your year: 
				""");
				String yearOne = input.nextLine();
				switch (yearOne.toLowerCase()) {
					case "freshman": System.out.println("mr uzochukwu"); break;
					case "sophomore": System.out.println("mr leke big head"); break;
					case "junior": System.out.println("prof boss olumide"); break;
					case "senior": System.out.println("miss black christiana"); break;
					default: System.out.println("invalid stuff");
				} break;


			case "history":
				System.out.print("""
				1. Freshman
				2. Sophomore
				3. junior
				4. senior
				enter your year: 
				""");
				String yearTwo = input.nextLine();
				switch (yearTwo.toLowerCase()) {
					case "freshman": System.out.println("mr uzochukwu"); break;
					case "sophomore": System.out.println("mr leke big head"); break;
					case "junior": System.out.println("prof boss olumide"); break;
					case "senior": System.out.println("miss black christiana"); break;
					default: System.out.println("invalid stuff");
				} break;

			default: System.out.println("invalid input"); break;
		}
		
	}
}