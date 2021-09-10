package shop.tripn.oracle.order.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.order.domain.OrderDto;

@Component 
public interface OrderService {
	public List<OrderDto> findAll();
	public OrderDto findByOrderId(int orderId);
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	
}
