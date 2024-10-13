 
public class Main {
    public static void main(String[] args) {
        // Create a Library object
        Library library = new Library();

        // Create a few Book objects
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", "101");
        Book book2 = new Book("1984", "George Orwell", "102");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "103");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // List all books in the library
        library.listBooks();
    }
}


