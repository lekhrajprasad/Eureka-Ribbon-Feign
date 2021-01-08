package com.coursecube.springboot;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MyBookPriceMS")
public interface BookPriceProxy {

	@GetMapping("/bookPrice/{bookId}")
    public BookPriceInfo getBookPrice(@PathVariable(value = "bookId") Integer bookId);
}
