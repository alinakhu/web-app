package edu.hneu.kpp.lab2.model;

import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Book;

import java.util.HashSet;
import java.util.Set;

public class AuthorModel {

    private Integer idAuthor;
    private String author;
    private Set<Book> books = new HashSet<>();

    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "AuthorModel{" +
                "idAuthor=" + idAuthor +
                ", author='" + author + '\'' +
                ", books=" + books +
                '}';
    }
}
