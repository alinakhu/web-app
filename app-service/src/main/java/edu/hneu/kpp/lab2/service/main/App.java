package edu.hneu.kpp.lab2.service.main;

import edu.hneu.kpp.lab2.service.BookService;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Book;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Logger> loggers = Collections.<Logger>list(LogManager.getCurrentLoggers());
        loggers.add(LogManager.getRootLogger());
        loggers.forEach(x->x.setLevel(Level.OFF));
        BookService bookService = new BookService();
        Book book1 = new Book(23, "The Brothers Karamazov", "Fyodor Dostoevsky");
        Book book2 = new Book(21, "War and Peace", "Leo Tolstoy");
        Book book3 = new Book(22, "Pride and Prejudice", "Jane Austen");
        System.out.println("*** Persist - start ***");
        bookService.persist(book1);
        bookService.persist(book2);
        bookService.persist(book3);
        List<Book> books1 = bookService.findAll();
        System.out.println("Books Persisted are :");
        for (Book b : books1) {
            System.out.println("-" + b.toString());
        }
        System.out.println("*** Persist - end ***");
        System.out.println("*** Update - start ***");
        book1.setTitle("The Idiot");
        bookService.update(book1);
        System.out.println("Book Updated is =>"
                + bookService.findById(book1.getId()).toString());
        System.out.println("*** Update - end ***");
        System.out.println("*** Find - start ***");
        int id1 = book1.getId();
        Book another = bookService.findById(id1);
        System.out.println("Book found with id " + id1 + " is =>" +

                another.toString());

        System.out.println("*** Find - end ***");
        System.out.println("*** Delete - start ***");
        int id3 = book3.getId();
        bookService.delete(id3);
        System.out.println("Deleted book with id " + id3 + ".");
        System.out.println("Now all books are " + bookService.findAll().size()

                + ".");

        System.out.println("*** Delete - end ***");
        System.out.println("*** FindAll - start ***");
        List<Book> books2 = bookService.findAll();
        System.out.println("Books found are :");
        for (Book b : books2) {
            System.out.println("-" + b.toString());
        }
        System.out.println("*** FindAll - end ***");
        System.out.println("*** DeleteAll - start ***");
        bookService.deleteAll();
        System.out.println("Books found are now " +

                bookService.findAll().size());

        System.out.println("*** DeleteAll - end ***");
        System.exit(0);
    }
}
