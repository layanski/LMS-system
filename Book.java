class Book {
    // Fields (Encapsulation with private access)
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods (Getters only, no setters)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to get book info as a string
    public String getBookInfo() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
