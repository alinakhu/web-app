package edu.hneu.kpp.lab2.model;

import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Author;

import java.util.HashSet;
import java.util.Set;

public class BookModel {
//    private int bookId;
//    private String title;
//    private Set<Author> authors = new HashSet<>();
//
//    public int getBookId() {
//        return bookId;
//    }
//    public void setBookId(int userid) {
//        this.bookId = userid;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Set<Author> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(Set<Author> authors) {
//        this.authors = authors;
//    }
//
//    @Override
//    public String toString() {
//        return "BookModel{" +
//                "bookId=" + bookId +
//                ", title='" + title + '\'' +
//                ", authors=" + authors +
//                '}';
//    }
private int bookId;
    private String title;
    private String author;
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int userid) {
        this.bookId = userid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override

    public String toString() {
        return "User [userid=" + bookId + ", title=" + title

                + ", author=" + author + "]";

    }
}
