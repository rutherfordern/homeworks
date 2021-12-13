package skypro.java.course1.lesson9;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Henri", "Poincare");
        Book book1 = new Book("Science and method", author1, 1910);

        Author author2 = new Author("Ben", "Orlin");
        Book book2 = new Book("Math with Bad Drawings", author2, 2018);

        book2.setBookPublicationYear(2019);
    }
}
