package shop.tripn.oracle.photo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.common.mapper.PhotoMapper;

@Service
public class PhotoServiceImpl implements PhotoService{
	@Autowired PhotoMapper photomapper;
	
	@Override
	public void save(PhotoDto t) {
		photomapper.save(t);
	}

	@Override
	public PhotoDto findById(Integer id) {
		return photomapper.findById(id);
	}

	@Override
	public List<PhotoDto> findAll() {
		return photomapper.findAll();
	}

	@Override
	public void update(PhotoDto t) {
		photomapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		photomapper.delete(id);
	}

}
