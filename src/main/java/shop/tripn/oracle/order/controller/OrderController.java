package shop.tripn.oracle.order.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shop.tripn.oracle.order.domain.OrderDto;
import shop.tripn.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderService orderservice;

	@RequestMapping("/register")
	public void save(OrderDto t) {
		orderservice.save(t);
	}
	@RequestMapping("/datail/{id}")
	public OrderDto findById(Integer id) {
		return orderservice.findById(id);
	}
	@RequestMapping("/list")
	public List<OrderDto> findAll() {
		return orderservice.findAll();
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(@RequestBody OrderDto t) {
		orderservice.update(t);
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void delete(@PathVariable Integer id) {
		orderservice.delete(id);
	}
	
}