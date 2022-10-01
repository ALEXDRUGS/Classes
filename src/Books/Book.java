package Books;

public class Book {
    private final String bookName;
    private int yearRelease;
    private final Author author;
    public Book(String bookName, int yearRelease, Author author) {
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

    public Author getAuthor() {
        return this.author;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
