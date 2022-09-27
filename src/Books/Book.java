package Books;

public class Book {
    private String bookName;
    private int yearRelease;

    public Book(String bookName, int yearRelease) {
        this.bookName = bookName;
        this.yearRelease = yearRelease;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearRelease() {
        return this.yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
