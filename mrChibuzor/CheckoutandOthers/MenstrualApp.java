import java.util.Scanner;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MenstrualApp {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        MenstrualApp person = new MenstrualApp();
        
        person.displayMenstrualInfo("Julia", input);
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
        delay();
            System.out.println("""
            \033[93m
            1. Flow Date
            2. Safe periods
            3. Ovulation dates
            4. back
            \033[0m
            """);
            System.out.print("> ");
            int options = input.nextInt();
            switch (options) {
                case 1: getNextMonth(name, input); break;
                case 4: displayMenstrualInfoTwo(name, input); break;
            }
    }
    
    public void getNextMonth(String name, Scanner input) {
        System.out.print("enter the month: ");
        int month = input.nextInt();
        System.out.print("enter the day: ");
        int day = input.nextInt();
        System.out.print("enter the year: ");
        int year = input.nextInt();
        calculateDate(month, day, year, input, name);
    }
    
    public void calculateDate(int month, int day, int year, Scanner input, String name) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month - 1); // January
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String defaultDate = sdf.format(cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, 28);
        String plus28Days = sdf.format(cal.getTime());

        System.out.println("first flow date: " + defaultDate);
        System.out.println("next flow date will be in 28 days: " + plus28Days + " (the range might differ sometimes might be over 28 or lower)");
        displayChoice(name, input);
    }
    
    public static void delay() {
        for (double delay = 0; delay < 1000000002; delay++) {
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
