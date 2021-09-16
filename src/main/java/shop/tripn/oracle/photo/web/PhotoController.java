package shop.tripn.oracle.photo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.tripn.oracle.photo.model.PhotoDto;
import shop.tripn.oracle.photo.model.PhotoService;

@Controller
@RequestMapping("/")
public class PhotoController {
	@Autowired PhotoService photoService;
	@Autowired PhotoDto photo;
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public void save(PhotoDto t) {
		photoService.save(t);
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(PhotoDto t) {
		photoService.update(t);
	}
	@RequestMapping("/delete")
	public void delete(Integer id) {
		photoService.delete(id);
	}	
}
