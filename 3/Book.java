public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main (String[] args){
        Book obj = new Book("Ikigai","Héctor García and Francesc Miralles");
        obj.displayDetails();
    }
}
