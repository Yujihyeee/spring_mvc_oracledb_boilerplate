package shop.tripn.oracle.photo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import shop.tripn.oracle.photo.domain.PhotoDto;
import shop.tripn.oracle.photo.service.PhotoService;

@Controller
@RequestMapping("/")
public class PhotoController {
	@Autowired PhotoService photoService;
	@Autowired PhotoDto photo;
	
	@RequestMapping
	public void save(PhotoDto t) {
		photoService.save(t);
	}
	@RequestMapping
	public PhotoDto findById(Integer id) {
		return photoService.findById(id);
	}
	@RequestMapping
	public List<PhotoDto> findAll() {
		return photoService.findAll();
	}
	@RequestMapping
	public void update(PhotoDto t) {
		photoService.update(t);
	}
	@RequestMapping
	public void delete(Integer id) {
		photoService.delete(id);
	}	
}
