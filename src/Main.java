public class Main {
    public static void main(String[] args) {

        Library myLibrary = new Library();

        //Create some books
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        //Create some users
        User user1 = new User("Rob");
        User user2 = new User( "Tim");

        //Initiate library
        myLibrary.addBook(book1);
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.printBooks();

        //Test - user1 tries borrowing 2 copies of book1
        user1.borrowBook(book1,myLibrary);
        user1.borrowBook(book1,myLibrary);
        user1.printBooks();

        myLibrary.printBooks();
        myLibrary.printLoans();

        user1.returnBook(book1,myLibrary);
        user1.printBooks();
        user1.returnBook(book2,myLibrary);
        user1.returnBook(book1,myLibrary);
        user1.returnBook(book1,myLibrary);
        user1.printBooks();

        myLibrary.printBooks();



    }
}
