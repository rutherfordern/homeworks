package skypro.java.course1.lesson10;


import java.util.Objects;

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

    @Override
    public String toString() {
        return author + ": " + nameBook + ": " + publicationYear;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && author.equals(book.author) && nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, publicationYear);
    }
}