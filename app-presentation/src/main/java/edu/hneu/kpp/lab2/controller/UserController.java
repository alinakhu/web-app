package edu.hneu.kpp.lab2.controller;

import edu.hneu.kpp.lab2.model.BookModel;
import edu.hneu.kpp.lab2.service.BookService;
import edu.hneu.kpp.lab2.util.Converter;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Author;
import edu.hneu.kpp.labdao.hibernatedao.hibernate.model.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet("/UserController")

public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/insert.jsp";
    private static String LIST_USER = "/showAll.jsp";
    private BookService bookService;

    public UserController() {
        bookService = new BookService();
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        String forward="";
//        String action = request.getParameter("action");
//        if (action.equalsIgnoreCase("delete")){
//            Integer userId = Integer.parseInt(request.getParameter("userId"));
//            bookService.delete(userId);
//            forward = LIST_USER;
//            request.setAttribute("users", bookService.findAll());
//        } else if (action.equalsIgnoreCase("edit")){
//            forward = INSERT_OR_EDIT;
//            int userId = Integer.parseInt(request.getParameter("userId"));
//            Book user = bookService.findById(userId);
//            request.setAttribute("user", user);
//        } else if (action.equalsIgnoreCase("showAll")){
//            forward = LIST_USER;
//            List<Book> bookList = bookService.findAll();
//            request.setAttribute("users", bookList);
//        } else {
//            forward = INSERT_OR_EDIT;
//        }
//        RequestDispatcher view = request.getRequestDispatcher(forward);
//        view.forward(request, response);
//    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Set<Author> authors = new HashSet<>();
//        BookModel bookModel = new BookModel();
//        bookModel.setTitle(request.getParameter("firstName"));
//        String[] authorNames = request.getParameterValues("lastName");
//        for (String a : authorNames) {
//            Author author = new Author();
//            author.setAuthor(a);
//            authors.add(author);
//        }
//        bookModel.setAuthors(authors);
//        String userid = request.getParameter("userid");
//        if(userid == null || userid.isEmpty())
//        {
//            Book bookEntity = new Book();
//            Converter.BookModelToBookEntity(bookEntity, bookModel);
//            bookService.persist(bookEntity);
//        }
//        else
//        {
//            bookModel.setBookId(Integer.parseInt(userid));
//            Book bookEntity = new Book();
//            Converter.BookModelToBookEntity(bookEntity, bookModel);
//            bookService.update(bookEntity);
//        }
//        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
//        request.setAttribute("users", bookService.findAll());
//        view.forward(request, response);
//    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
    String forward="";
    String action = request.getParameter("action");
    if (action.equalsIgnoreCase("delete")){
        int userId = Integer.parseInt(request.getParameter("userId"));
        bookService.delete(userId);
        forward = LIST_USER;
        request.setAttribute("users", bookService.findAll());
    } else if (action.equalsIgnoreCase("edit")){
        forward = INSERT_OR_EDIT;
        int userId = Integer.parseInt(request.getParameter("userId"));
        Book user = bookService.findById(userId);
        request.setAttribute("user", user);
    } else if (action.equalsIgnoreCase("showAll")){
        forward = LIST_USER;
        List<Book> bookList = bookService.findAll();
        request.setAttribute("users", bookList);
    } else {
        forward = INSERT_OR_EDIT;
    }
    RequestDispatcher view = request.getRequestDispatcher(forward);
    view.forward(request, response);
}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        BookModel bookModel = new BookModel();
        bookModel.setTitle(request.getParameter("firstName"));
        bookModel.setAuthor(request.getParameter("lastName"));
        String userid = request.getParameter("userid");
        if(userid == null || userid.isEmpty())
        {
            Book bookEntity = new Book();
            Converter.BookModelToBookEntity(bookEntity, bookModel);
            bookService.persist(bookEntity);
        }

        else
        {
            bookModel.setBookId(Integer.parseInt(userid));
            Book bookEntity = new Book();
            Converter.BookModelToBookEntity(bookEntity, bookModel);
            bookService.update(bookEntity);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("users", bookService.findAll());
        view.forward(request, response);
    }
}

