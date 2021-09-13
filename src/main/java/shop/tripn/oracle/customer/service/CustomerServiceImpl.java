package shop.tripn.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customermapper;
	@Override
	public List<CustomerDto> findAll() {
		return customermapper.findAll();
	}

	@Override
	public CustomerDto findById(int custId) {
		return customermapper.findById(custId);
	}
	
	@Override
	public void save(CustomerDto customer) {
		customermapper.save(customer);
	}

	@Override
	public CustomerDto findByName(String custName) {
		return customermapper.findByName(custName);
	}

	@Override
	public CustomerDto findByAddress(String address) {
		return customermapper.findByAddress(address);
	}

	@Override
	public CustomerDto findByPhone(String custPhone) {
		return customermapper.findByPhone(custPhone);
	}

}
