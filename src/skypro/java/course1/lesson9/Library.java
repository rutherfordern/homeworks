package skypro.java.course1.lesson9;

public class Library {

    private final Book[] books;

    public Library(int bookSize) {
        this.books = new Book[bookSize];
    }

    // Метод, который добавляет книги в библиотеку
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    // Метод, который печатает все книги в библиотеке
    public void printAllBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName()
                        + ": " + book.getNameBook() + ": " + book.getPublicationYear());
            }
        }
    }

    // Метод, который печатает информацию о книге по ее названию
    public void printNameBooks(String nameBook) {
        for (Book book : books) {
            if (nameBook.equals(book.getNameBook())) {
                System.out.println(book.getNameBook() + " by " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName()
                        +  " was published in " + book.getPublicationYear());
            } else {
                System.out.println("Такой книги не нашлось :(");
            }
            return;
        }
    }

    // Метод, который изменяет год публикации книги по ее названию
    public void changePublicationYear(String nameBook, int newPublicationYear) {
        for (Book book : books) {
            if (nameBook.equals(book.getNameBook())) {
                book.setBookPublicationYear(newPublicationYear);
                System.out.println("Год публикации книги " + book.getNameBook() + " на "
                + book.getPublicationYear());
            }
        }
    }
}
