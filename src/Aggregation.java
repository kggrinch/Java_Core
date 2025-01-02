import package1.B;

import java.util.ArrayList;

public class Aggregation {
    public static void main(String[] args) {

        // Aggregation = Represents a relationship where one object (the whole) contains references to one or more
        //               independent objects (the parts)

        Library library = new Library("New York Public Library");

        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("The Hobbit", "J. R. R. Tolkien");
        Book book3 = new Book("The Colour of Magic", "Terry Pratchet");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println(library.name);
        library.booksInLibrary();





    }
}

// The whole
class Library
{
    String name;
    ArrayList<Book> books;
    Library(String name)
    {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        this.books.add(book);
    }

    public void booksInLibrary()
    {
        for(Book book: books)
        {
            System.out.println(book.title +" by "+ book.author);
        }
    }
}

// the parts which can be stored in the whole
class Book
{
    String title;
    String author;
    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
}
