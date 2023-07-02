import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        if(books.contains(book)) {
            System.out.println("This book is already " +
                    "in the library");
            return false;
        } else {
            books.add(book);
            return true;
        }
    }

    public boolean removeBook(Book book) {
        if(books.contains(book)) {
            books.remove(book);
            return true;
        } else {
            System.out.println("This book is not in the library.");
            return false;
        }
    }

    public  void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
