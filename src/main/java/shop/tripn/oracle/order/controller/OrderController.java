package shop.tripn.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.order.domain.OrderDto;
import shop.tripn.oracle.order.service.OrderService;

@Controller
public class OrderController {
	@Autowired OrderService orderService;
	
	@RequestMapping("/orders")
	public void findAll() {
		List<OrderDto> orders = orderService.findAll();
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping("/orders/orderId/{orderId}")
	public void findByOrderId(@PathVariable int orderId) {
		OrderDto orders = orderService.findByOrderId(orderId);
	}
	
	@RequestMapping("/orders/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		OrderDto orders = orderService.findByCustId(custId);
	}
	
	@RequestMapping("/orders/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		OrderDto orders = orderService.findByBookId(bookId);
	}
}
