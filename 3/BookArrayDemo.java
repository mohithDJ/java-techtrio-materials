public class BookArrayDemo {
    public static void main(String[] args) {
        String[] books = new String[3];

        books[0] = "Clean Code: A Handbook of Agile Software Craftsmanship by Robert C. Martin";
        books[1] = "The Pragmatic Programmer by David Thomas and Andrew Hunt";
        books[2] = "Code Complete by Steve McConnell";

        for (int i = 0; i < books.length; i++) {
            System.out.println(i+1+": "+books[i]);
        }
    }
}
