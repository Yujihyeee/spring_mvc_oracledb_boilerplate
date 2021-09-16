package shop.tripn.oracle.customer.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.tripn.oracle.customer.model.CustomerDto;
import shop.tripn.oracle.customer.model.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController{
	@Autowired CustomerService customerService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void save(CustomerDto t) {
		customerService.save(t);
	}
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public CustomerDto findById(Integer id) {
		return customerService.findById(id);
	}
	@RequestMapping(value = "/list", method = RequestMethod.POST)
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
