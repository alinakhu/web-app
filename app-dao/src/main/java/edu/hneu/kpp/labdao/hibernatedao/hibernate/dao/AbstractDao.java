package edu.hneu.kpp.labdao.hibernatedao.hibernate.dao;

import edu.hneu.kpp.labdao.hibernatedao.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDao<T, Id extends Serializable> implements GenericDaoInterface<T, Id> {

    protected Session currentSession;
    protected Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = HibernateUtil.getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionWithTransaction() {
        currentSession = HibernateUtil.getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    @Override
    public void persist(T entity) {
        currentSession.save(entity);
    }

    @Override
    public void update(T entity) {
        currentSession.update(entity);
    }

    @Override
    public void delete(T entity) {
        currentSession.delete(entity);
    }

    @Override
    public void deleteAll() {
        List<T> entities = findAll();
        for (T entity : entities) {
            delete(entity);
        }
    }
}
