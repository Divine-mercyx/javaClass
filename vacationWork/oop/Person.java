package vacationWork.oop;

public class Person {

    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
    }


    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }


    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address = address;
    }


    public String getAddress(){
        return address;
    }


    public String toString(){
        return name + " " + age + " " + address;
    }

}
