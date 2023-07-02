public class Main {
    public static void main(String[] args) {

        Library myLibrary = new Library();

        //Create some books
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        myLibrary.printBooks();

    }
}
