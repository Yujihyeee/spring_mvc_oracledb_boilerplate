package shop.tripn.oracle.customer.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class CustomerDto {
	private int custId;
	private String custName;
	private String address;
	private int custPhone;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(int custPhone) {
		this.custPhone = custPhone;
	}
	
}
