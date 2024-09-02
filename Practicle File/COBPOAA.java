class Book {
    String title;
    String author;
    int pages;
    // Constructor 1: No arguments
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.pages = 0;
    }
    // Constructor 2: Passing title, author, and pages
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    // Constructor 3: Passing an existing Book object (copy constructor)
    Book(Book existingBook) {
        this.title = existingBook.title;
        this.author = existingBook.author;
        this.pages = existingBook.pages;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
public class COBPOAA {
    public static void main(String[] args) {
        // Using Constructor 1
        Book book1 = new Book();
        System.out.println("Book 1 details:");
        book1.displayDetails();

        // Using Constructor 2
        Book book2 = new Book("1984", "George Orwell", 328);
        System.out.println("\nBook 2 details:");
        book2.displayDetails();

        // Using Constructor 3 (Copy Constructor)
        Book book3 = new Book(book2);
        System.out.println("\nBook 3 details (copied from Book 2):");
        book3.displayDetails();
    }
}
