package Phase1.Application.controllers;

import Phase1.Application.models.Book;
import Phase1.Application.models.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by manju on 3/25/2017.
 */
@Controller

@RequestMapping(path="/search")
public class SearchController {

    @Autowired
    BookDao bookDao;


    @RequestMapping(path = "/getBooks")
    public @ResponseBody
    Iterable<Book> getBooks(){

        return bookDao.findAll();
    }

    @RequestMapping(path = "/getBookByISBN")
    public @ResponseBody
    Iterable<Book> getBookByISBN(@RequestParam(value="searchTerm", defaultValue="978-0070062726")String isbn){

        return bookDao.findByISBN(isbn);
    }

    @RequestMapping(path = "/getBookBycName")
    public @ResponseBody
    Iterable<Book> getBookBycourseName(@RequestParam(value="cName", defaultValue="Engineering Economics")String cName){

        return bookDao.findBycourseName(cName);
    }

    @RequestMapping(path = "/getBookBybookName")
    public @ResponseBody
    Iterable<Book> getBookBybookName(@RequestParam(value="searchTerm")String bookName){

        return bookDao.getBookBybookName(bookName);
    }

    @RequestMapping(path = "/getBookBybookAuthor")
    public @ResponseBody
    Iterable<Book> getBookBybookAuthor(@RequestParam(value="bookAuthor", defaultValue="Behrouz Forouzan")String bookAuthor){

        return bookDao.findBycourseName(bookAuthor);
    }


}
