package Books;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Анна Каренина", 2000);
        Author author = new Author("Лев", "Толстой");
        Book book1 = new Book("Бойцовский клуб", 2005);
        Author author1 = new Author("Чак", "Паланик");
        System.out.println(author.getName() + " " + author.getSurname() + "\n" + book.getBookName() +
                "\n" + book.getYearRelease() + " год выпуска");
        System.out.println(author1.getName() + " " + author1.getSurname() + "\n" + book1.getBookName() +
                "\n" + book1.getYearRelease() + " год выпуска");
        book.setYearRelease(1999);
        System.out.println(book.getYearRelease() + " год предыдущего выпуска");
    }
}