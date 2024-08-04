package com.ltc.student.service;

import com.ltc.student.dto.request.BookRequestDto;
import com.ltc.student.dto.response.BookResponseDto;
import com.ltc.student.entity.Book;
import com.ltc.student.repository.BookRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    public List<BookResponseDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(book -> modelMapper.map(book, BookResponseDto.class))
                .toList();
    }


    @PostConstruct
    public void scrapeBooks() throws IOException {
        Document root = Jsoup.connect("https://books.toscrape.com/catalogue/page-1.html").get();
        int pageCount = Integer.parseInt(root.select("li.current").text().split(" ")[3]);

        for (int i = 1; i <= pageCount; i++) {
            Document doc = Jsoup.connect("https://books.toscrape.com/catalogue/page-" + i + ".html").get();

            Elements books = doc.select("li.col-xs-6.col-sm-4.col-md-3.col-lg-3");

            for (Element book : books) {
                String title = book.select("h3 a").attr("title");
                String price = book.select("p.price_color").text();
                String availability = book.select("p.instock.availability").text();

                BookRequestDto bookRequestDto = new BookRequestDto();
                bookRequestDto.setTitle(title);
                bookRequestDto.setPrice(Double.parseDouble(price.substring(1)));
                bookRequestDto.setAvailable(availability);

                Book newBook = modelMapper.map(bookRequestDto, Book.class);
                bookRepository.save(newBook);
            }
        }
    }
}