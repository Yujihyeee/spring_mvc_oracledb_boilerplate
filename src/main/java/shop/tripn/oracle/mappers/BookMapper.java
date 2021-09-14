package shop.tripn.oracle.mappers;

import org.springframework.stereotype.Repository;
import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.common.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer>{

}
