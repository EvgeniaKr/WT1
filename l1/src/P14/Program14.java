package P14;

import P14.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Program14 {
    public static void main(String[] args){
        //  Book.setEdition(15);
        Book b1 = new Book("The World as Will and Representation", "A. Shopenhauer", 2500, "9847501664276");
        System.out.println(b1);
        System.out.println("Hash code = " + b1.hashCode());
        Book b2 = new Book("Beyond Good and Evil", "F. Nietzsche", 3940, "1234567899876");
        System.out.println(b2);
        System.out.println("Hash code = " + b2.hashCode());

        TreeSet<Book> list = new TreeSet<Book>();
        list.add(b1);
        list.add(b2);
        Iterator<Book> it = list.iterator();
        while(it.hasNext()){
            Book book = it.next();
            System.out.println(book.getIsbn() + " - " + book.getTitle());
        }
        ArrayList<Book> arr = new ArrayList<>();
        arr.addAll(list);

    }
}
