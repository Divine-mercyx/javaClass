public class Pizza {

    public static void main(String... args) {
        getOrders(45, "odogwu");
    }
    
    public static void getOrders(int size, String pizzaType) {
        switch (pizzaType.toLowerCase()) {
            case "supa size": calculateDetails(pizzaType, 2500, size, 4); break;
            case "small money": calculateDetails(pizzaType, 2900, size, 6); break;
            case "big boys": calculateDetails(pizzaType, 4000, size, 8); break;
            case "odogwu": calculateDetails(pizzaType, 5200, size, 12); break;
            default: System.out.printf("we don't serve %s", pizzaType);
        }
    }
    
    public static void calculateDetails(String pizzaType, double amount, int size, int pizzaSize) {
        int counter = 0;
        int slices = 0;
        while (slices < size) {
            slices += pizzaSize;
            counter++;
        }
        displayOrderDetails(counter, slices, pizzaType, amount, size, pizzaSize);
    }
    
    public static void displayOrderDetails(int counter, int slices, String pizzaType, double amount, int size, int pizzaSize) {
        System.out.println("Number of boxes to buy = " + counter + " boxes (explanation " + pizzaType + " size contains " + pizzaSize + "\nslices per box, " + counter + " should be sufficient for " + size + " persons/person as it would contain " + slices + " in all)");
        System.out.println();
        System.out.println("Number of leftover slices = " + (slices - size) + " slices (explanation: after serving " + size + " slices, you should have " + (slices - size) + " slices left)");
        System.out.println();
        System.out.println("price = " + (counter * amount) + " (explanation " + amount + " per box for " + counter + " boxes");
    }
}
