package shop.tripn.oracle.book.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.book.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired BookService bookService;
	@Autowired BookDto book;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String save(BookDto book) {
		bookService.save(book);
		return "등록 완료";
	}
	@RequestMapping
	public BookDto findById(Integer id) {
		return bookService.findById(id);
	}
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public String findAll() {
		List<BookDto> books = bookService.findAll();
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
		return "조회 완료";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(@RequestBody BookDto book) {
		bookService.update(book);
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void delete(@PathVariable Integer id) {
		bookService.delete(id);
	}
}
