package shop.tripn.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.book.domain.BookDto;

@Repository
public interface BookMapper {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	public BookDto findByPubId(int pubId);
	public BookDto findByBookTitle(String bookTitle);
	public BookDto findByPrice(int price);
	void save(BookDto book);
}
