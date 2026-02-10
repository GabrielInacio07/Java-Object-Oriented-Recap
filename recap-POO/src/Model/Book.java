package Model;

public class Book {

    private String title;
    private String author;
    private int chapter;

    public Book(String title, String author, int chapter) {
        this.title = title;
        this.author = author;
        this.chapter = chapter;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getChapter() {
        return chapter;
    }
}
