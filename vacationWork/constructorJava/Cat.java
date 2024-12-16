public class Cat {
    
    private String name;
    private int age;
    
    public Cat() {
        name = "unknown";
        age = 0;
    }
    
    public String toString() {
        return String.format("%s%s%n%s%d ", "name: ", name, "age: ", age);
    }
    
    public static void main(String... args) {
        Cat cat = new Cat();
        
        System.out.println(cat.toString());
    }
}
