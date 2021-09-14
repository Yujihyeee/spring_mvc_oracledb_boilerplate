package shop.tripn.oracle.mappers;

import org.springframework.stereotype.Repository;
import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{
	
}
