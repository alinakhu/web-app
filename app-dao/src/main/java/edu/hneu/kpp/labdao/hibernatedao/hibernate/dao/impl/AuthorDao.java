package edu.hneu.kpp.labdao.hibernatedao.hibernate.dao.impl;

import edu.hneu.kpp.labdao.hibernatedao.hibernate.dao.AbstractDao;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.dao.AuthorDaoInterface;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Author;

import java.util.List;

public class AuthorDao extends AbstractDao<Author, Integer> implements AuthorDaoInterface<Author, Integer> {

    @Override
    public Author findById(Integer id) {
        return (Author) currentSession.get(Author.class, id);
    }

    @Override
    public List<Author> findAll() {
        List<Author> authors = (List<Author>)currentSession.createQuery("from author").list();
        return authors;
    }
}
