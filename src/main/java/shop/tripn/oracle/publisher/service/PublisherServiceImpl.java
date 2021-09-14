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
	public void save(PublisherDto t) {
		publishermapper.save(t);
	}

	@Override
	public PublisherDto findById(Integer id) {
		return publishermapper.findById(id);
	}

	@Override
	public List<PublisherDto> findAll() {
		return publishermapper.findAll();
	}

	@Override
	public void update(PublisherDto t) {
		publishermapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		publishermapper.delete(id);
	}
	
}
