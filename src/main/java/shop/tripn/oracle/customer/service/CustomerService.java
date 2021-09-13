package shop.tripn.oracle.customer.service;


import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.customer.domain.CustomerDto;

@Component
public interface CustomerService {
	public List<CustomerDto> findAll();
	public CustomerDto findById(int custId);
	public CustomerDto findByName(String custName);
	public CustomerDto findByAddress(String address);
	public CustomerDto findByPhone(String custPhone);
	void save(CustomerDto customer);
}
