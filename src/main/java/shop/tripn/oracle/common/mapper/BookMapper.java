package shop.tripn.oracle.common.mapper;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.book.model.BookDto;
import shop.tripn.oracle.common.service.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer>{

}
