package skypro.java.course1.lesson9;

public class Book {

    private Author author;
    private String nameBook;
    private int bookPublicationYear;

    public Book(String nameBook, Author author, int bookPublicationYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.bookPublicationYear = bookPublicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

}
