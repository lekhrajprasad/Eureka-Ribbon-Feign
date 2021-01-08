package com.coursecube.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookSearchController {

    @Autowired
    BookPriceProxy bookPriceProxy;

    @GetMapping("/mybook/{bookId}")
    public BookInfo getBookByBookId(@PathVariable Integer bookId) {

        BookInfo bookInfo = new BookInfo(bookId, "Master Spring Boot 2", "Srinivas", "JLC", "Java");
        BookPriceInfo bookPriceInfo = bookPriceProxy.getBookPrice(bookId);
        bookInfo.setPrice(bookPriceInfo.getPrice());
        bookInfo.setOffer(bookPriceInfo.getOffer());
        bookInfo.setServerPort(bookPriceInfo.getServerPort());
        System.out.println("---BookController---getBookById()---: "+bookId+" -- Port :"+bookInfo.getServerPort());
        return bookInfo;
    }
}
