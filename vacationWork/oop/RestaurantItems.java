public class RestaurantItems {

    private String menuItem;
    private String price;

    public RestaurantItems(String menuItems, String price) {
        setMenuItems(menuItems);
        setPrice(price);
    }
    
    
    public void setMenuItems(String item) {
        menuItem = item;
    }
    
    
    public String getMenuItem() {
        return menuItem;
    }
    
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    
    public String getPrice() {
        return price;
    }
}
