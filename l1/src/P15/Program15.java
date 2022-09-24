package P15;
import P14.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Program15 {
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
        ArrayList<Book> arr = new ArrayList<>();
        arr.addAll(list);
        arr.sort(new SName());
        System.out.println(arr);
        arr.sort(new SNameAuthor());
        System.out.println(arr);
        arr.sort(new SAuthorName());
        System.out.println(arr);
        arr.sort(new SAuthorNamePrice());
        System.out.println(arr);

    }
    static class SName implements Comparator<Book> {
        @Override
        public int compare(Book b1, Book b2){
            return b1.getTitle().compareTo(b2.getTitle());
        }
    }

    static class SNameAuthor implements Comparator<Book>{
        @Override
        public int compare(Book b1, Book b2){
            int count =  b1.getTitle().compareTo(b2.getTitle());
            if (count == 0){
                return b1.getAuthor().compareTo(b2.getAuthor());
            }
            return count;
        }
    }

    static class SAuthorName implements Comparator<Book>{
        @Override
        public int compare(Book b1, Book b2){
            int count =  b1.getAuthor().compareTo(b2.getAuthor());
            if (count == 0){
                return b1.getTitle().compareTo(b2.getTitle());
            }
            return count;
        }
    }

    static class SAuthorNamePrice implements Comparator<Book>{
        @Override
        public int compare(Book b1, Book b2){
            int count =  b1.getAuthor().compareTo(b2.getAuthor());
            if (count == 0){
                count = b1.getTitle().compareTo(b2.getTitle());
                if (count == 0){
                    return Integer.compare(b1.getPrice(), b2.getPrice());
                }
                return count;
            }
            return count;
        }
    }
}
