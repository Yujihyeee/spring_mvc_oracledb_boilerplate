package shop.tripn.oracle.book.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
