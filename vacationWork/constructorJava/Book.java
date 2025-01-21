public class Book {

    private String title;
    private String author;
    private double price;
    
    public Book() {
        title = "unknown";
        author = "unknown";
        price = 0.0;
        System.out.println("title: " + title + "\nauthor: " + author + "\nprice: " + price + "\n");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("title: " + this.title + "\nauthor: " + this.author + "\n");
    }
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("title: " + this.title + "\nauthor: " + this.author + "\nprice: " + this.price);
    }
    
    public static void main(String... args) {
        Book book1 = new Book();
        Book book2 = new Book("the lightening theif", "rick riordan");
        Book book3 = new Book("star trek", "divine boss", 45.3);
    }
}
