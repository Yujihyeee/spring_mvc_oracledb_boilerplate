package shop.tripn.oracle.book.service;

import org.springframework.stereotype.Component;
import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.common.GenericInterface;

@Component
public interface BookService extends GenericInterface<BookDto, Integer>{

}
