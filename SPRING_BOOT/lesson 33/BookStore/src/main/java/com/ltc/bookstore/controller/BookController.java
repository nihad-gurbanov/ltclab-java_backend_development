package com.ltc.bookstore.controller;

import com.ltc.bookstore.entity.Book;
import com.ltc.bookstore.repository.BookRepository;
import com.ltc.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @PostMapping("/create")
    public String create(@RequestBody Book book) {
        bookService.addBook(book);
        return "Book created";
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

}
