package shop.tripn.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.mappers.OrderMapper;
import shop.tripn.oracle.order.domain.OrderDto;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper ordermapper;
	@Override
	public List<OrderDto> findAll() {
		return ordermapper.findAll();
	}

	@Override
	public OrderDto findByOrderId(int orderId) {
		return ordermapper.findByOrderId(orderId);
	}

	@Override
	public List<OrderDto> findByCustId(int custId) {
		return ordermapper.findByCustId(custId);
	}

	@Override
	public List<OrderDto> findByBookId(int bookId) {
		return ordermapper.findByBookId(bookId);
	}

}
