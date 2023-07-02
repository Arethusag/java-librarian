import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Library {
    private List<Book> books;
    private Map<Book, Integer> catalog;
    public Library() {
        this.books = new ArrayList<>();
        this.catalog = new HashMap<Book, Integer>();
    }

    public boolean addBook(Book book) {
        Integer quantity = catalog.getOrDefault(book, 0);
        catalog.put(book, quantity + 1);
        return true;
    }

    public boolean removeBook(Book book) {
        Integer quantity = catalog.get(book);
        if(quantity == null || quantity == 0) {
            System.out.println("This book is not in the library.");
            return false;
        } else {
            catalog.put(book, quantity - 1);
            return true;
        }
    }

    public  void printBooks() {
        for (Map.Entry<Book, Integer> entry : catalog.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Name" : " + k)

            System.out.println(book);
        }
    }
}
