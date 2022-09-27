package Books;

public class Book {
    private final String bookName;
    private int yearRelease;
    private final String author;
    public Book(String bookName, int yearRelease, String author) {
        this.bookName = bookName;
        this.yearRelease = yearRelease;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearRelease() {
        return this.yearRelease;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
