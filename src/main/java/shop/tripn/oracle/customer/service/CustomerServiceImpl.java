package shop.tripn.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customermapper;

	public List<CustomerDto> findAll() {
		return customermapper.findAll();
	}

	public CustomerDto findById(int custId) {
		return customermapper.findById(custId);
	}
	
	/*
	 * public void save(CustomerDto customer) { customermapper.save(customer); }
	 */

	public CustomerDto findByName(String custName) {
		return customermapper.findByName(custName);
	}

	public CustomerDto findByAddress(String address) {
		return customermapper.findByAddress(address);
	}

	public CustomerDto findByPhone(String custPhone) {
		return customermapper.findByPhone(custPhone);
	}

	@Override
	public void save(CustomerDto t) {
	}

	@Override
	public CustomerDto findById(Integer id) {
		return null;
	}

	@Override
	public void update(CustomerDto t) {
	}

	@Override
	public void delete(Integer id) {
	}
	
}
