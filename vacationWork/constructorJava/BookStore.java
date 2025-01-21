import java.util.ArrayList;


public class BookStore {

    private ArrayList<BookObject> books;
    private String title;
    private String author;
    private String isbn;
    
    public BookStore(String title, String author, String isbn) {
        books = new ArrayList<>();
        addBook(title, author, isbn);
    }
    
    public BookStore() {
        books = new ArrayList<>();
    }
    
    
    public void addBook(String title, String author, String isbn) {
        books.add(new BookObject(title, author, isbn));
        System.out.println("added successfully");
    }
    
    public void removeBook(String title) {
        BookObject book = findByTitle(title);
            if (book != null) {
                books.remove(book);
                System.out.println("book have been removed");
            } else {
                System.out.println("book title does not exist");
            }
    }
    
    public BookObject findByTitle(String title) {
        for (BookObject book : books) {
            if (book.getTitle() == title) {
                return book;
            }
        }
         return null;
    }
    
    
    public static void main(String... args) {
        BookStore person = new BookStore();
        person.removeBook("titans");
        person.addBook("titans", "divine", "123678");
        person.removeBook("titans");
    }
}
