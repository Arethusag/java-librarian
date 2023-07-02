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

    public void borrowBook(Book book, Library library) {
        if(library.loanBook(book, this)) {
            this.books.add(book);
        } else {
            System.out.println("This book is not available for loan.");
        }
    }

    public boolean returnBook(Book book, Library library) {
        if(this.books.contains(book) && library.returnBook(book, this)) {
                this.books.remove(book);
                return true;
        } else {
            System.out.println( this.name +
                    "doesn't have" +
                    book.getTitle() +
                    ".");
            return false;
        }
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public  void printName() {
            System.out.println(name);
    }

}
