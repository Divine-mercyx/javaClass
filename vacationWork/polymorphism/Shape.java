public class Shape {

    public void draw() {
        System.out.println("drawing a shape");
    }
    
    public void greet() {
        System.out.println("hola amigos");
    }
    
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.greet();
    }
}


