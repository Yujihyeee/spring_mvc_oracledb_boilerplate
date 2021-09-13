package shop.tripn.oracle.publisher.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.publisher.domain.PublisherDto;

@Component
public interface PublisherService {
	public List<PublisherDto> findAll();
	public PublisherDto findById(int pubId);
	public PublisherDto findByName(String pubName);
	public PublisherDto findByMgrName(String mgrName);
	public PublisherDto findByPhone(String phone);
	void save(PublisherDto publisher);
}
