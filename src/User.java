import java.util.List;
import java.util.ArrayList;

public class User {

    //fields
    private String name;
    private List<Book> books;

    //constructor
    public  User(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public boolean borrowBook(Book book, Library library) {
        if(library.removeBook(book)) {
            this.books.add(book);
            return true;
        } else {
            System.out.println("This book is not available " +
                    "in the library.");
            return false;
        }
    }

    public boolean returnBook(Book book, Library library) {
        if(this.books.contains(book)) {
            this.books.remove(book);
            library.addBook(book);
            return true;
        } else {
            System.out.println( this.name +
                    " doesn't have " + book.getTitle() +
                    "to return.");
            return false;
        }

    }

    public  void printBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public  void printName() {
            System.out.println(name);
    }

}
