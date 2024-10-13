import java.util.ArrayList;

public class Library {
    // Field (ArrayList to store Book objects)
    private ArrayList<Book> books;

    // Constructor to initialize the books list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to list all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.getBookInfo());
            }
        }
    }
}

