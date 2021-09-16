package shop.tripn.oracle.common.mapper;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.common.service.GenericInterface;
import shop.tripn.oracle.order.model.OrderDto;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer>{
	
}
