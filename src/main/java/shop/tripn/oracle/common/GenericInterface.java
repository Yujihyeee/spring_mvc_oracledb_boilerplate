package shop.tripn.oracle.common;

import java.util.List;

import shop.tripn.oracle.book.domain.BookDto;

public interface GenericInterface <T, U> {
	
	void save(T t);
	T findById(U id);
	List<T> findAll();
	void update(T t);
	void delete(U id);
}
