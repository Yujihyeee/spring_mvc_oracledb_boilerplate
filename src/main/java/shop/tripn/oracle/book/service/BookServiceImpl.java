package shop.tripn.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper bookmapper;
	@Override
	public List<BookDto> findAll() {
		return bookmapper.findAll();
	}
	@Override
	public BookDto findById(int bookId) {
		return bookmapper.findById(bookId);
	};

}
