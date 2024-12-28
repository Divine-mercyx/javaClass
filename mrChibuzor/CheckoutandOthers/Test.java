import java.util.Scanner;

public class Test {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int sum = 0;
    
        do {
            System.out.print("enter miles driven: ");
            int milesDriven = input.nextInt();
            
            System.out.print("enter amount of galons used: ");
            int galonUsed = input.nextInt();
            
            int milesPerGalon = milesDriven * galonUsed;
            sum += milesPerGalon;
            System.out.println(milesPerGalon);
            
            System.out.print("do you want to continue ? 1(yes) 2(no)");
            choice = input.nextInt();
        } while (choice == 1);
           
        System.out.println("total miles per galon is: " + sum);
    }
}
