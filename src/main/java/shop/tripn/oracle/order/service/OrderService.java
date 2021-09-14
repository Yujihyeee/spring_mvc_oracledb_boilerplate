package shop.tripn.oracle.order.service;

import org.springframework.stereotype.Component;
import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.order.domain.OrderDto;

@Component 
public interface OrderService extends GenericInterface<OrderDto, Integer>{

}
