package edu.hneu.kpp.labdao.hibernatedao.hibernate.dao.impl;

import edu.hneu.kpp.labdao.hibernatedao.hibernate.dao.AbstractDao;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.dao.GenericDaoInterface;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Book;

import java.util.List;

public class BookDao extends AbstractDao<Book, Integer> implements GenericDaoInterface<Book, Integer> {

    @Override
    public Book findById(Integer id) {
        return (Book) currentSession.get(Book.class, id);
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = (List<Book>)currentSession.createQuery("from Book").list();
        return books;
    }

}
