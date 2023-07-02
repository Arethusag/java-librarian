public class Main {
    public static void main(String[] args) {

        Library myLibrary = new Library();

        //Create some books
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        //Create some users
        User user1 = new User("Bob");
        User user2 = new User( "Gerald");

        myLibrary.addBook(book1);
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        user1.borrowBook(book1, myLibrary);
        user1.returnBook(book1, myLibrary);

        user2.borrowBook(book2, myLibrary);
        user2.borrowBook(book2, myLibrary);

        user2.returnBook(book1, myLibrary);


        myLibrary.printBooks();

    }
}
