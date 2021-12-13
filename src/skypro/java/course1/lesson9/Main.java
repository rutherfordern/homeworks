package skypro.java.course1.lesson9;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Henri", "Poincare");
        Book book1 = new Book("Science and method", author1, 1910);

        Author author2 = new Author("Ben", "Orlin");
        Book book2 = new Book("Math with Bad Drawings", author2, 2018);

        book2.setBookPublicationYear(2019);

        Book[] books = new Book[2];
        addBook(books, book1);
        addBook(books, book2);

        printBooks(books);

    }

    public static void addBook(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }

        }
    }

    public static void printBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName()
                + ": " + book.getNameBook() + ": " + book.getPublicationYear());
            }
        }
    }

}


