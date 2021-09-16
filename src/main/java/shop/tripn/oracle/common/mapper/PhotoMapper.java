package shop.tripn.oracle.common.mapper;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.common.service.GenericInterface;
import shop.tripn.oracle.photo.model.PhotoDto;
@Repository
public interface PhotoMapper extends GenericInterface<PhotoDto, Integer>{
	
}
