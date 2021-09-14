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
	
	@RequestMapping("")
	public String save(BookDto t) {
		bookService.save(t);
		return "";
	}
	@RequestMapping("")
	public BookDto findById(Integer id) {
		return bookService.findById(id);
	}
	@RequestMapping("")
	public List<BookDto> findAll() {
		return bookService.findAll();
	}
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public String update(@RequestBody BookDto t) {
		bookService.update(t);
		return "";
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public void delete(@PathVariable Integer id) {
		bookService.delete(id);
	}
}
