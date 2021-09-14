package shop.tripn.oracle.mappers;

import org.springframework.stereotype.Repository;
import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer>{
	
}
