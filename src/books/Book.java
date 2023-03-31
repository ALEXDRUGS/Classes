package books;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String bookName;
    private int yearRelease;

    @Override
    public String toString() {
        return author + "\n" + bookName + "\n" + yearRelease + " год выпуска";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearRelease == book.yearRelease && author.equals(book.author) && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, yearRelease);
    }

    public Book(Author author, String bookName, int yearRelease) {
        this.author = author;
        this.bookName = bookName;
        this.yearRelease = yearRelease;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
