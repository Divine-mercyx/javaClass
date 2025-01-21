public class Time {

    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        if ( (hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)  ) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    
    public void universalTime() {
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
    
    public static void main(String... args) {
        Time clock = new Time();
        
        clock.setTime(5, 4, 12);
        clock.universalTime();
    }
}
