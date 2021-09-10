package shop.tripn.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.customer.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired CustomerService customerService;
	
	@RequestMapping("/customers")
	public void findAll() {
		List<CustomerDto> custs = customerService.findAll();
		for(CustomerDto cust : custs) {
			System.out.println(cust.toString());
		}
	}
	@RequestMapping("/customers/custId/{custId}")
	public void findById(@PathVariable int custId) {
		CustomerDto custs = customerService.findById(custId);
		System.out.println(custs.toString());
	}
}
