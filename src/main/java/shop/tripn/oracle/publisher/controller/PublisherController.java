package shop.tripn.oracle.publisher.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shop.tripn.oracle.publisher.domain.PublisherDto;
import shop.tripn.oracle.publisher.service.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	@Autowired PublisherService publisherService;

	@RequestMapping("")
	public void save(PublisherDto t) {
		publisherService.save(t);
	}

	@RequestMapping("")
	public PublisherDto findById(Integer id) {
		return publisherService.findById(id);
	}

	@RequestMapping("")
	public List<PublisherDto> findAll() {
		return publisherService.findAll();
	}

	@RequestMapping(value = "/publishers", method = RequestMethod.POST)
	public void update(@RequestBody PublisherDto t) {
		publisherService.update(t);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public void delete(@PathVariable Integer id) {
		publisherService.delete(id);
	}
}
