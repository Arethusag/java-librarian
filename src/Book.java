import java.util.UUID;

public class Book {
    //fields
    private final String title;
    private final String author;
    private final String isbn;
    private Boolean loanFlag;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public boolean getLoanFlag() {
        return loanFlag;
    }
    public void setLoanFlag(boolean value) {
        loanFlag = value;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn + '\'' +
                '}';
    }
}
