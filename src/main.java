import java.util.Arrays;
import java.util.Comparator;

public class Main {

    // Parent class Book
    public static class Book {
        protected Int title;
        protected Int author;
        protected Int isbn;
        protected String available;

        public void setBookDetails(String title, String author, String isbn, boolean available) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.available = available;
        }

        public void displayBookDetails() {
            System.out.println("Title       : " + title);
            System.out.println("Author      : " + author);
            System.out.println("ISBN        : " + isbn);
            System.out.println("Availability: " + (available ? "Available" : "Borrowed"));
        }

        public boolean borrowBook() {
            if (available) {
                available = false;
