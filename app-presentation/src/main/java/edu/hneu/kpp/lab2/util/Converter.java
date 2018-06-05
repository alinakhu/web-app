package edu.hneu.kpp.lab2.util;

import edu.hneu.kpp.lab2.model.AuthorModel;
import edu.hneu.kpp.lab2.model.BookModel;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Author;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Book;

public final class Converter {

//    private Converter() {
//
//    }
//
//    public static void BookEntityToBookModel(BookModel model, Book book){
//        model.setAuthors(book.getAuthors());
//        model.setTitle(book.getTitle());
//        model.setBookId(book.getId());
//    }
//    public static void BookModelToBookEntity(Book book, BookModel model){
//        book.setAuthors(model.getAuthors());
//        book.setTitle(model.getTitle());
//        book.setId(model.getBookId());
//    }
//
//    public static void AuthorEntityToModel(AuthorModel model, Author author) {
//        model.setAuthor(author.getAuthor());
//        model.setBooks(author.getBooks());
//        model.setIdAuthor(author.getId());
//    }
//
//    public static void AuthorEntityToModel(Author author, AuthorModel model) {
//        author.setAuthor(model.getAuthor());
//        author.setBooks(model.getBooks());
//        author.setId(model.getIdAuthor());
//    }
public static void BookEntityToBookModel(BookModel model, Book book) {
    model.setAuthor(book.getAuthor());
    model.setTitle(book.getTitle());
    model.setBookId(book.getId());
}

    public static void BookModelToBookEntity(Book book, BookModel model) {
        book.setAuthor(model.getAuthor());
        book.setTitle(model.getTitle());
        book.setId(model.getBookId());
    }

}
