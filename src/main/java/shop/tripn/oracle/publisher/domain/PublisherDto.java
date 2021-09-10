package shop.tripn.oracle.publisher.domain;

import org.springframework.stereotype.Component;

@Component
public class PublisherDto {
	private int pubId;
	private String pubName;
	private String mrgName;
	private int phone;
	
	public int getPubId() {
		return pubId;
	}
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public String getMrgName() {
		return mrgName;
	}
	public void setMrgName(String mrgName) {
		this.mrgName = mrgName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
