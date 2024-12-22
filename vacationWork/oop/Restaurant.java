import java.util.ArrayList;

public class Restaurant {

    private ArrayList<RestaurantItems> restaurantItems;
    
    public Restaurant() {
        restaurantItems = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Restaurant dominos = new Restaurant();
        dominos.addItems("pizza", "6000");
        
    }
    
    public void addItems(String item, String price) {
        RestaurantItems items = new RestaurantItems(item, price);
        restaurantItems.add(items);
        System.out.println("successfully added an item");
    }
    
    
    public RestaurantItems findItem(String item) {
        boolean isFound = false;
        if (!restaurantItems.isEmpty()) {
            for (RestaurantItems items : restaurantItems) {
                if (items.getMenuItem().equalsIgnoreCase(item)) {
                    isFound = true;
                    return items;
                }
            }
        }
        return null;
    }
    
    
    public void removeItems(String menuItem) {
        RestaurantItems item = findItem(menuItem);
        if (item != null) {
            restaurantItems.remove(item);
        }
    }
    
}
