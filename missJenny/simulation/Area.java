import java.util.Scanner;

public class Area {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		shapeType(input);
	}

	public static void shapeType(Scanner input) {
		System.out.println("""
		1. Circle
		2. Rectangle
		3. Triangle
		4. exit
		""");

		int choice = input.nextInt();
		switch (choice) {
			case 1:
				System.out.println("do you want to enter the value(yes) give a default value(no) ?: ");
				String circleChoice = input.next();
				if (circleChoice.equalsIgnoreCase("yes")) {
					System.out.print("enter the radius: ");
					int radius = input.nextInt();
					circle(input, radius);
				} 
				else if (circleChoice.equalsIgnoreCase("no")) {
					circle(input, 20);
				}
				break;


			case 2:
				System.out.println("do you want to enter the value(yes) give a default value(no) ?: ");
				String rectangleChoice = input.next();
				if (rectangleChoice.equalsIgnoreCase("yes")) {
					System.out.print("enter the length: ");
					int length = input.nextInt();
					System.out.print("enter the breadth: ");
					int breadth = input.nextInt();
					rectangle(input, length, breadth);
				} 
				else if (rectangleChoice.equalsIgnoreCase("no")) {
					rectangle(input, 20, 40);
				}
				break;
			

			case 3:
				System.out.println("do you want to enter the value(yes) give a default value(no) ?: ");
				String triangleChoice = input.next();
				if (triangleChoice.equalsIgnoreCase("yes")) {
					System.out.print("enter the base: ");
					int base = input.nextInt();
					System.out.print("enter the height: ");
					int height = input.nextInt();
					triangle(input, base, height);
				} 
				else if (triangleChoice.equalsIgnoreCase("no")) {
					triangle(input, 20, 40);
				}
				break;
			case 4: System.out.println("exiting... "); break;

			default: System.out.println("invalid input");
		}
	}


	public static void circle(Scanner input, int radius) {
		double area = 3.14 * radius;
		System.out.println(area);
	}


	public static void rectangle(Scanner input, int length, int breadth) {
		int area = length * breadth;
		System.out.println(area);
	}


	public static void triangle(Scanner input, int base, int height) {
		int area = (base * height) / 2;
		System.out.println(area);
	}

	
}