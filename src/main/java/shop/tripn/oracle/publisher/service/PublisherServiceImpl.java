package shop.tripn.oracle.publisher.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.tripn.oracle.mappers.PublisherMapper;
import shop.tripn.oracle.publisher.domain.PublisherDto;

@Service
public class PublisherServiceImpl implements PublisherService{
	@Autowired PublisherMapper publishermapper;
	@Override
	public List<PublisherDto> findAll() {
		return publishermapper.findAll();
	}

	@Override
	public PublisherDto findById(int pubId) {
		return publishermapper.findById(pubId);
	}

}
