package vacationWork.oop;

import java.util.ArrayList;

public class University {

    private ArrayList<Person> people;

    public University() {
        people = new ArrayList<>();
    }


    public void addPerson(Person person) {
        people.add(person);
    }


    public void removePerson(Person person) {
        people.remove(person);
    }


    public void displayPersons() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

}
