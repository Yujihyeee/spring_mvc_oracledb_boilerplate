package shop.tripn.oracle.common.mapper;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.common.service.GenericInterface;
import shop.tripn.oracle.customer.model.CustomerDto;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{
	
}
