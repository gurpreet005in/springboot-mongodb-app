package com.javatechie.springbootmongodb.dao;

import com.javatechie.springbootmongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,Integer> {

    Book findBookByName(String name);
    List<Book> findBookByAuthor(String author);
}
