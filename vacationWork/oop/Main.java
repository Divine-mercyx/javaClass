package vacationWork.oop;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student student = new Student("divine boss", 12, "no 7 tanimowo street", "321", "computer science", 3.6);

        university.addPerson(student);
        university.displayPersons();
    }
}
