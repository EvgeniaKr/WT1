package P13;

import P12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public int hashCode(){
        int result = 10 * language.hashCode() + 20456 + 10 * level + 20456;
        return result;
    }

    @Override
    public boolean equals(Object obj)  {
        return language != null && language.equals(((ProgrammerBook) (obj)).language) &&  level == ((ProgrammerBook) (obj)).level;
    }

    @Override
    public String toString(){
        return super.toString() + "\nLanguage: " + language + "\nLevel: " + level;
    }

    public ProgrammerBook(String title, String author, int price, String language, int level){
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}