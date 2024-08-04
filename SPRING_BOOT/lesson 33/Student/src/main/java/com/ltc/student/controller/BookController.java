package com.ltc.student.controller;

import com.ltc.student.dto.response.BookResponseDto;
import com.ltc.student.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping ("/all")
    public List<BookResponseDto> getAllBooks() {
        return bookService.getAllBooks();
    }
}
