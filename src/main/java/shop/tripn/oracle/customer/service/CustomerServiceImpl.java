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
	public void save(CustomerDto t) {
		customermapper.save(t);
	}

	@Override
	public CustomerDto findById(Integer id) {
		return customermapper.findById(id);
	}

	@Override
	public List<CustomerDto> findAll() {
		return customermapper.findAll();
	}

	@Override
	public void update(CustomerDto t) {
		customermapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		customermapper.delete(id);
	}
	
}
