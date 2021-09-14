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
	public void save(OrderDto t) {
		ordermapper.save(t);
	}

	@Override
	public OrderDto findById(Integer id) {
		return ordermapper.findById(id);
	}

	@Override
	public List<OrderDto> findAll() {
		return ordermapper.findAll();
	}

	@Override
	public void update(OrderDto t) {
		ordermapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		ordermapper.delete(id);
	}

}
