package shop.tripn.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.order.domain.OrderDto;
import shop.tripn.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController implements GenericInterface<OrderDto, Integer>{
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	@Override
	public void save(OrderDto t) {
	}
	@Override
	public OrderDto findById(Integer id) {
		return null;
	}
	@Override
	public List<OrderDto> findAll() {
		return null;
	}
	@Override
	public void update(OrderDto t) {
	}
	@Override
	public void delete(Integer id) {
	}
	
	/*
	 * @RequestMapping("/orders") public void findAll() { List<OrderDto> orders =
	 * orderService.findAll(); for(OrderDto order : orders) {
	 * System.out.println(order.toString()); } }
	 * 
	 * @RequestMapping("/orders/orderId/{orderId}") public void
	 * findByOrderId(@PathVariable int orderId) { OrderDto orders =
	 * orderService.findByOrderId(orderId); System.out.println(orders.toString()); }
	 * 
	 * @RequestMapping("/orders/custId/{custId}") public void
	 * findByCustId(@PathVariable int custId) { List<OrderDto> orders =
	 * orderService.findByCustId(custId); for(OrderDto order : orders) {
	 * System.out.println(order.toString()); } }
	 * 
	 * @RequestMapping("/orders/bookId/{bookId}") public void
	 * findByBookId(@PathVariable int bookId) { List<OrderDto> orders =
	 * orderService.findByBookId(bookId); for(OrderDto order : orders) {
	 * System.out.println(order.toString()); } }
	 * 
	 * @RequestMapping(value = "/join", method = {RequestMethod.POST}) public String
	 * join(
	 * 
	 * @RequestParam("orderId") int orderId,
	 * 
	 * @RequestParam("custId") int custId,
	 * 
	 * @RequestParam("bookId") int bookId,
	 * 
	 * @RequestParam("orderPrice") int orderPrice,
	 * 
	 * @RequestParam("orderDate") String orderDate) {
	 * System.out.println("orderId : " + orderId); System.out.println("custId : " +
	 * custId); System.out.println("bookId : " + bookId);
	 * System.out.println("orderPrice : " + orderPrice);
	 * System.out.println("orderDate : " + orderDate); order = new OrderDto();
	 * order.setOrderId(orderId); order.setCustId(custId); order.setBookId(bookId);
	 * order.setOrderPrice(orderPrice); order.setOrderDate(orderDate);
	 * orderService.save(order); return "order 성공"; }
	 */
	
}
