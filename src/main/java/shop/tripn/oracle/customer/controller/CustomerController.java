package shop.tripn.oracle.customer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController{
	@Autowired CustomerService customerService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void save(CustomerDto t) {
		customerService.save(t);
	}
	@RequestMapping("/detail/{id}")
	public CustomerDto findById(Integer id) {
		return customerService.findById(id);
	}
	@RequestMapping("/")
	public List<CustomerDto> findAll() {
		return customerService.findAll();
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(@RequestBody CustomerDto t) {
		customerService.update(t);
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void delete(@PathVariable Integer id) {
		customerService.delete(id);
	}
	
}
