package com.javatechie.springbootmongodb.controller;

import com.javatechie.springbootmongodb.model.Book;
import com.javatechie.springbootmongodb.service.BookService;
import com.javatechie.springbootmongodb.service.Impl.BookServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookController {

     private BookService bookService;

     @GetMapping
     public ResponseEntity<List<Book>> getBooks(){
         return new ResponseEntity<>(bookService.getBooks(), HttpStatus.OK);
     }

     @GetMapping("/{name}")
     public ResponseEntity<Book> getBookByName(@PathVariable ("name") String bookName){
         return new ResponseEntity<>(bookService.getBookByName(bookName),HttpStatus.OK);
     }

     @GetMapping("/author/{author}")
     public ResponseEntity<List<Book>> getBookByAuthor(@PathVariable("author") String author){
         return new ResponseEntity<>(bookService.getBookByAuthor(author),HttpStatus.OK);
     }
     @PostMapping
    public ResponseEntity<Book> createBookRecord(@RequestBody Book book){
         return new ResponseEntity<>(bookService.createBookRecord(book),HttpStatus.CREATED);
     }
}
