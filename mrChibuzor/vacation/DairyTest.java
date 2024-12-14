public class DairyTest {

    public static void main(String... args) {
        User person = new User();
        person.createDairy();
        person.addNewEntry("1", "i love to write to my dairy and stuff");
        person.lockDiary();
        person.updateEntry("1", "hey");
        person.unlock();
        person.updateEntry("1", "hey");
    }
}
