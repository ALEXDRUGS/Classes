package Books;
public class Main {

    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book("Анна Каренина", 2000, author);
        Author author1 = new Author("Чак", "Паланик");
        Book book1 = new Book("Бойцовский клуб", 2005, author1);
        System.out.println(book.getAuthor().getName() + " " + book.getAuthor().getSurname()
                + "\n" + book.getBookName() + "\n" + book.getYearRelease() + " год " + "выпуска");
        System.out.println(book1.getAuthor().getName() + " " + book1.getAuthor().getSurname()
                + "\n" + book1.getBookName() + "\n" + book1.getYearRelease() + " год " + "выпуска");
        book.setYearRelease(1999);
        System.out.println(book.getYearRelease() + " год предыдущего выпуска");
    }
}