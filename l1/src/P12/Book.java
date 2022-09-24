package P12;

public class Book{
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    @Override
    public int hashCode() {
        int result = 10 * title.hashCode() + 20456 + 10 * author.hashCode() + 20456 + 10 * price + 20456;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return title != null && title.equals(((Book) (obj)).title) && author != null && author.equals(((Book) (obj)).author) && price == ((Book) (obj)).price;
    }

    @Override
    public String toString() {
        return "\nBook title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nEdition: " + edition;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
