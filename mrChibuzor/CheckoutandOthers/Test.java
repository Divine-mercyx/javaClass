import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DefaultDatePlus28Days {
    public static void main(String[] args) {
        // Set default date to January 1st, 2024
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 11); // January
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.YEAR, 2024);

        // Get the default date as a string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String defaultDate = sdf.format(cal.getTime());

        // Add 28 days to the default date
        cal.add(Calendar.DAY_OF_MONTH, 28);
        String plus28Days = sdf.format(cal.getTime());

        System.out.println("Default date: " + defaultDate);
        System.out.println("Plus 28 days: " + plus28Days);
    }
}
