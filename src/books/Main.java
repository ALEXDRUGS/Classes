package books;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book(author, "Анна Каренина", 2000);
        System.out.println(book);

        Author author1 = new Author("Чак", "Паланик");
        Book book1 = new Book(author1, "Бойцовский клуб", 2005);
        System.out.println(book1);

        book.setYearRelease(1999);
        System.out.println(book.getYearRelease() + " год предыдущего выпуска");

    }
}