public class Sheep extends Animal {

    @Override
    public void makeSound() {
        System.out.println("bleat");
    }
    
    public static void main(String[] args) {
        Sheep lamb = new Sheep();
        
        lamb.makeSound();
    }
}
