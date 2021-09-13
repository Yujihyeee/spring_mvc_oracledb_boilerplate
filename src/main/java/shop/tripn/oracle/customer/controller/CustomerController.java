package shop.tripn.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerService customerService;
	@Autowired CustomerDto customer;
	
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
	@RequestMapping(value="/join", method= {RequestMethod.POST})
	public String join(
			@RequestParam("custId") int custId,
			@RequestParam("custName") String custName,
			@RequestParam("address") String address,
			@RequestParam("custPhone") String custPhone) {
		System.out.println("custId: " + custId);
		System.out.println("custName: " + custName);
		System.out.println("address: " + address);
		System.out.println("custPhone: " + custPhone);
		customer = new CustomerDto();
		customer.setCustId(custId);
		customer.setCustName(custName);
		customer.setAddress(address);
		customer.setCustPhone(custPhone);
		customerService.save(customer);
		return "회원가입 성공";
	}
	@RequestMapping(value="/login", method= {RequestMethod.POST})
	public String login() {
		return "로그인 성공";
	}
}
