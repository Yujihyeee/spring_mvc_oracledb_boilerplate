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
	public void save(BookDto t) {
		bookmapper.save(t);
	}

	@Override
	public BookDto findById(Integer id) {
		return bookmapper.findById(id);
	}

	@Override
	public List<BookDto> findAll() {
		return bookmapper.findAll();
	}

	@Override
	public void update(BookDto t) {
		bookmapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		bookmapper.delete(id);
	}
	
}
