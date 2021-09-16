package shop.tripn.oracle.publisher.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.tripn.oracle.publisher.model.PublisherDto;
import shop.tripn.oracle.publisher.model.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	@Autowired PublisherService publisherService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void save(PublisherDto t) {
		publisherService.save(t);
	}

	@RequestMapping
	public PublisherDto findById(Integer id) {
		return publisherService.findById(id);
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public List<PublisherDto> findAll() {
		return publisherService.findAll();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(@RequestBody PublisherDto t) {
		publisherService.update(t);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void delete(@PathVariable Integer id) {
		publisherService.delete(id);
	}
}
