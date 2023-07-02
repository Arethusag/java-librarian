import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Library {
    private final Map<Book, Integer> catalog;
    private final List<Loan> loans;
    public Library() {
        this.catalog = new HashMap<Book, Integer>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        Integer quantity = catalog.getOrDefault(book, 0);
        catalog.put(book, quantity + 1);
        book.setLoanFlag(false);
    }

    public boolean loanBook(Book book, User user) {
        Integer quantity = catalog.get(book);
        if(quantity == null || quantity == 0) {
            System.out.println("This book is not in the library.");
            return false;
        } else {
            catalog.put(book, quantity - 1);
            loans.add(new Loan(user, book));
            book.setLoanFlag(true);
            return true;
        }
    }

    public boolean returnBook(Book book, User user) {
        for (Loan loan : loans) {
            if (loan.book().equals(book) && loan.user().equals(user)) {
                loans.remove(loan);
                Integer quantity = catalog.getOrDefault(book, 0);
                catalog.put(book, quantity + 1);
                return true;
            }
        }
        System.out.println("This book is not on loan");
        return false;
    }

    public  void printBooks() {
        System.out.println("Library's catalog of books:" + "\n");
        for (Map.Entry<Book, Integer> entry : catalog.entrySet()) {
            Book key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Book: " + key + ", Quantity: " + value);
        }
    }

    public void printLoans() {
        System.out.println("Library's outstanding loans:" + "\n");
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}
