package kitapSiralayici;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> booksByTitle=new TreeSet<>();
        booksByTitle.add(new Book("The Catcher in the Rye", 277, "J.D. Salinger", "1951"));
        booksByTitle.add(new Book("To Kill a Mockingbird", 324, "Harper Lee", "1960"));
        booksByTitle.add(new Book("1984", 328, "George Orwell", "1949"));
        booksByTitle.add(new Book("Pride and Prejudice", 279, "Jane Austen", "1813"));
        booksByTitle.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925"));

        System.out.println("Book sorted by title:");
        for(Book book:booksByTitle){
            System.out.println(book);
        }

        Set<Book> booksByPageCount=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPageCount(), o2.getPageCount());
            }
        });

        booksByPageCount.addAll(booksByTitle);

        System.out.println("\nBooks sorted by page count:");
        for(Book book:booksByPageCount){
            System.out.println(book);
        }
    }
}
