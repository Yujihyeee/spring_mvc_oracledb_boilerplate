package shop.tripn.oracle.common.mapper;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.common.service.GenericInterface;
import shop.tripn.oracle.publisher.model.PublisherDto;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDto, Integer>{

}
