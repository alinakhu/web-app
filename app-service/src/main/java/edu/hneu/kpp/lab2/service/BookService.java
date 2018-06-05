package edu.hneu.kpp.lab2.service;

import edu.hneu.kpp.labdao.hibernatedao.hibernate.dao.impl.BookDao;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Book;

import java.util.List;

public class BookService {

    private BookDao bookDao;

    public BookService() {
        bookDao = new BookDao();
    }

    public void persist(Book entity) {
        bookDao.openCurrentSessionWithTransaction();
        bookDao.persist(entity);
        bookDao.closeCurrentSessionWithTransaction();
    }

    public void update(Book entity) {
        bookDao.openCurrentSessionWithTransaction();
        bookDao.update(entity);
        bookDao.closeCurrentSessionWithTransaction();
    }

    public Book findById(Integer id) {
        bookDao.openCurrentSession();
        Book book = bookDao.findById(id);
        bookDao.closeCurrentSession();
        return book;
    }

    public void delete(Integer id) {
        bookDao.openCurrentSessionWithTransaction();
        Book book = bookDao.findById(id);
        bookDao.delete(book);
        bookDao.closeCurrentSessionWithTransaction();
    }

    public List<Book> findAll() {
        bookDao.openCurrentSession();
        List<Book> books = bookDao.findAll();
        bookDao.closeCurrentSession();
        return books;
    }

    public void deleteAll() {
        bookDao.openCurrentSessionWithTransaction();
        bookDao.deleteAll();
        bookDao.openCurrentSessionWithTransaction();
    }

    public BookDao bookDao() {
        return bookDao;
    }
}
