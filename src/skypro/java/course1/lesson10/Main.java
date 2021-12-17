package skypro.java.course1.lesson10;


public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Henri", "Poincare");
        Book book1 = new Book("Science and method", author1, 1910);

        Author author2 = new Author("Ben", "Orlin");
        Book book2 = new Book("Math with Bad Drawings", author2, 2018);

        book2.setBookPublicationYear(2019);

        Library library = new Library(2);

        library.addBook(book1);
        library.addBook(book2);

        library.printAllBooks();
        library.printNameBooks("Science and method");

        library.changePublicationYear("Math with Bad Drawings", 2018);

    }


}