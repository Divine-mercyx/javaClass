public class DairyTest {

    public static void main(String... args) {
        User person = new User();
        person.createDairy();
        person.addNewEntry("1", "i love to write to my dairy and stuff");
        person.addNewEntry("2", "i am a good boy what about you ?");
        person.findEntry("2");
    }
}
