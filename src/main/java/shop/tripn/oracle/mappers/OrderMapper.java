package shop.tripn.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper {
	public List<OrderDto> findAll();
	public OrderDto findByOrderId(int orderId);
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	void save(OrderDto order);
}
