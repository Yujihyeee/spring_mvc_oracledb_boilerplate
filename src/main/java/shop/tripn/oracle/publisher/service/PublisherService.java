package shop.tripn.oracle.publisher.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.publisher.domain.PublisherDto;

@Component
public interface PublisherService {
	public List<PublisherDto> findAll();
	public PublisherDto findById(int pubId);
}
