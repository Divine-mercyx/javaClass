public class Dog {
    
    private String name;
    private String color;
    
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public String toString() {
        return String.format("%s%s%n%s%s ", "name: ", name, "color: ", color);
    }
    
    public static void main(String... args) {
        Dog dog = new Dog("bingo", "brown");
        
        System.out.println(dog.toString());
    }
}
