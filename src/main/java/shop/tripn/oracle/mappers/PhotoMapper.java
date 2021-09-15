package shop.tripn.oracle.mappers;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.photo.domain.PhotoDto;
@Repository
public interface PhotoMapper extends GenericInterface<PhotoDto, Integer>{
	
}
