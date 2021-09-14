package shop.tripn.oracle.customer.service;

import org.springframework.stereotype.Component;
import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.customer.domain.CustomerDto;

@Component
public interface CustomerService extends GenericInterface<CustomerDto, Integer>{

}
