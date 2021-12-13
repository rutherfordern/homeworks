package skypro.java.course1.lesson9;

public class Book {

    private Author author;
    private String nameBook;
    private int publicationYear;

    public Book(String nameBook, Author author, int publicationYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.publicationYear = bookPublicationYear;
    }

}
