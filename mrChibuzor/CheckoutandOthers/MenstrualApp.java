import java.util.Scanner;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MenstrualApp {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        MenstrualApp person = new MenstrualApp();
        
        System.out.print("enter your name: ");
        String name = input.nextLine();
        person.displayMenstrualInfo(name, input);
    }

    public void displayMenstrualInfo(String name, Scanner input) {
        System.out.println("\033[93mHello " + name + "\033[0m");
        delay();
        System.out.println("""
        \033[93m
        Average Cycle Length: The average menstrual cycle lasts 28 days,\nbut it can range from 21 to 35 days and still be considered normal.
        \033[0m
        """);
        delay();
        System.out.println("""
        \033[93m
        Phases of the Cycle: The menstrual cycle has four phases:
        1. Menstruation (days 1-5): The uterus sheds its lining, resulting in bleeding.
        2. Follicular Phase (days 6-14): The uterus prepares for a potential pregnancy by thickening its lining. Estrogen levels rise, causing the uterine lining to thicken.
        3. Ovulation (around day 14): The pituitary gland releases luteinizing hormone (LH), triggering the release of an egg from the ovary.
        4. Luteal Phase (days 15-28): If the egg is not fertilized, the corpus luteum produces progesterone, maintaining the uterine lining. If pregnancy occurs, the fertilized egg implants in the uterine lining.
        \033[0m
        """);
        displayChoice(name, input);
    }
    
        public void displayMenstrualInfoTwo(String name, Scanner input) {
            System.out.println("\033[93mWelcome back " + name + "\033[0m");
            delay();
            System.out.println("""
            \033[93m
            Average Cycle Length: The average menstrual cycle lasts 28 days,\nbut it can range from 21 to 35 days and still be considered normal.
            \033[0m
            """);
            delay();
            System.out.println("""
            \033[93m
            Phases of the Cycle: The menstrual cycle has four phases:
            1. Menstruation (days 1-5): The uterus sheds its lining, resulting in bleeding.
            2. Follicular Phase (days 6-14): The uterus prepares for a potential pregnancy by thickening its lining. Estrogen levels rise, causing the uterine lining to thicken.
            3. Ovulation (around day 14): The pituitary gland releases luteinizing hormone (LH), triggering the release of an egg from the ovary.
            4. Luteal Phase (days 15-28): If the egg is not fertilized, the corpus luteum produces progesterone, maintaining the uterine lining. If pregnancy occurs, the fertilized egg implants in the uterine lining.
            \033[0m
            """);
            displayChoice(name, input);
    } 

    public void displayChoice(String name, Scanner input) {  
        System.out.println("""  
            \033[93m  
            1. Flow Date  
            2. Safe Periods  
            3. Ovulation Dates  
            4. Back  
            \033[0m  
            """);  
        System.out.print("> ");  
        int option = input.nextInt();  
        switch (option) {  
            case 1: getNextMonth(name, input);  break;
            case 2: calculateSafePeriods(name, input); break; 
            case 4: displayMenstrualInfoTwo(name, input); break;
            default: System.out.println("Invalid option. Please try again.");  break;
        }  
    } 

    private void getNextMonth(String name, Scanner input) {  
        int[] date = getInputDate(input);  
        calculateAndDisplayNextFlowDate(date[0], date[1], date[2], name, input);  
    }  

    private int[] getInputDate(Scanner input) {  
        System.out.print("Enter the month: ");  
        int month = input.nextInt();  
        System.out.print("Enter the day: ");  
        int day = input.nextInt();  
        System.out.print("Enter the year: ");  
        int year = input.nextInt();  
        return new int[]{month, day, year};  
    }  

    private void calculateAndDisplayNextFlowDate(int month, int day, int year, String name, Scanner input) {  
        Calendar cal = Calendar.getInstance();  
        cal.set(year, month - 1, day); 

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
         

        cal.add(Calendar.DAY_OF_MONTH, 28); 
        String nextFlowDate = dateFormat.format(cal.getTime());  

        System.out.println("Next flow date will be in 28 days: " + nextFlowDate +  
                " (the range might differ, sometimes over or under 28 days)");  
        
        displayChoice(name, input);
    }  

    private void calculateSafePeriods(String name, Scanner input) {  
        int[] date = getInputDate(input);  
        displaySafePeriods(date[0], date[1], date[2]);  
        displayChoice(name, input);  
    }  

    private void displaySafePeriods(int month, int day, int year) {  
        Calendar cal = Calendar.getInstance();  
        cal.set(year, month - 1, day);  
        

        cal.add(Calendar.DAY_OF_MONTH, 7);
        String endOfFlow = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());  

        cal.add(Calendar.DAY_OF_MONTH, 7);
        String startOfOvulation = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());  

        System.out.println("Safe Period:");  
        System.out.println("From: " + endOfFlow + " to: " + startOfOvulation + " (before ovulation)");
    }  

    public static void delay() {
        for (double delay = 0; delay < 1000000002; delay++) {
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
