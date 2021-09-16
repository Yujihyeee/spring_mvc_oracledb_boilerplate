package shop.tripn.oracle.book.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.book.model.BookDto;
import shop.tripn.oracle.book.model.BookService;

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
	@RequestMapping("/detail/bookId")
	public BookDto findById(@RequestParam Integer id) {
		return bookService.findById(id);
	}
	@RequestMapping("/list")
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
