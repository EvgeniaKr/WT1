package P12;

public class Program12 {

    public static void main(String[] args){
      //  Book.setEdition(15);
        Book b1 = new Book("The World as Will and Representation", "A. Shopenhauer", 2500);
        System.out.println(b1);
        System.out.println("Hash code = " + b1.hashCode());
        Book b2 = new Book("Beyond Good and Evil", "F. Nietzsche", 3940);
        System.out.println(b2);
        System.out.println("Hash code = " + b2.hashCode());

    }
}