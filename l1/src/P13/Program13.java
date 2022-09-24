package P13;
import P12.Book;


public class Program13 {

    public static void main(String[] args){
        Book b1 = new Book("The World as Will and Representation", "A. Shopenhauer", 2500);
        System.out.println(b1);
        System.out.println("Hash code = " + b1.hashCode());
        Book b2 = new Book("Beyond Good and Evil", "F. Nietzsche", 3940);
        System.out.println(b2);
        System.out.println("Hash code = " + b2.hashCode());

        ProgrammerBook b3 = new ProgrammerBook("Pascal Guide", "N. Virt", 3990, "English", 500);
        System.out.println(b3);
        System.out.println("Hash code = " + b3.hashCode());

    }
}