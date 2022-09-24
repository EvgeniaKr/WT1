package P14;

public class Book implements Cloneable, Comparable<Book>{
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;
    protected String isbn;



    public Book(String title, String author, int price, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Book obj){
        return isbn.compareTo(obj.isbn);
    }

    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public int hashCode() {
        int result = 10 * title.hashCode() + 20456 + 10 * author.hashCode() + 20456 + 10 * price + 20456;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return title != null && title.equals(((P14.Book) (obj)).title) && author != null && author.equals(((P14.Book) (obj)).author) && price == ((P14.Book) (obj)).price;
    }

    @Override
    public String toString() {
        return "\nBook title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nEdition: " + edition;
    }
    public static int getEdition() { return edition; }

    public static void setEdition(int edition) { Book.edition = edition; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getIsbn() { return isbn; }
}

