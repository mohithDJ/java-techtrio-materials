package project;
import java.util.*;

class Book {
    String title, author, isbn;
    boolean isAvailable = true;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ") - " + (isAvailable ? "Available" : "Borrowed");
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
        System.out.println("Added: " + title);
    }

    void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    void lendBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn) && book.isAvailable) {
                book.isAvailable = false;
                System.out.println("Borrowed: " + book.title);
                return;
            }
        }
        System.out.println("Book not available!");
    }

    void returnBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn) && !book.isAvailable) { //!true = false
                book.isAvailable = true;
                System.out.println("Returned: " + book.title);
                return;
            }
        }
        System.out.println("Book not found!");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n1. Add Book  \n2. View Books  \n3. Borrow Book  \n4. Return Book  \n5. Exit");
            int choice = in.nextInt();
            in.nextLine(); // The program would skip the next string input

            if (choice == 1) {
                System.out.print("Enter Title: ");
                String title = in.nextLine();
                System.out.print("Enter Author: ");
                String author = in.nextLine();
                System.out.print("Enter ISBN: ");
                String isbn = in.nextLine();
                library.addBook(title, author, isbn);
            } else if (choice == 2) {
                library.viewBooks();
            } else if (choice == 3) {
                System.out.print("Enter ISBN to Borrow: ");
                String isbn = in.nextLine();
                library.lendBook(isbn);
            } else if (choice == 4) {
                System.out.print("Enter ISBN to Return: ");
                String isbn = in.nextLine();
                library.returnBook(isbn);
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        in.close();
    }
}
