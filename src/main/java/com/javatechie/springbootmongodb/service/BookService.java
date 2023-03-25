package com.javatechie.springbootmongodb.service;

import com.javatechie.springbootmongodb.model.Book;
import java.util.List;

public interface BookService {

    List<Book> getBooks ();
    Book getBookByName(String name);
    List<Book> getBookByAuthor(String authorName);
    Book createBookRecord(Book book);
}
