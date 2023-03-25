package com.javatechie.springbootmongodb.service.Impl;

import com.javatechie.springbootmongodb.dao.BookRepository;
import com.javatechie.springbootmongodb.model.Book;
import com.javatechie.springbootmongodb.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private BookRepository repository;
//    private static List<Book> books = new ArrayList<>();
//    {
//        books.add(new Book(1,"MyLifeExperiments","Gurpreet Singh"));
//        books.add(new Book(1,"MyFinalGoals","Gurpreet Singh"));
//    }
    @Override
    public List<Book> getBooks() {
        return repository.findAll();
       // return books;
    }

    @Override
    public Book getBookByName(String bookName) {
       return repository.findBookByName(bookName);
     //  return books.stream().filter(x->x.getName().equalsIgnoreCase(bookName)).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Book> getBookByAuthor(String authorName) {
        return repository.findBookByAuthor(authorName);
//       return books.stream().filter(x->x.getAuthor().equalsIgnoreCase(authorName))
//               .collect(Collectors.toList());
    }

    @Override
    public Book createBookRecord(Book book) {
        return repository.save(book);
    }

}