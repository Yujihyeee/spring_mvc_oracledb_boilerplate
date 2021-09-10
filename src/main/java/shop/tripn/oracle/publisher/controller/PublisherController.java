package shop.tripn.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.publisher.domain.PublisherDto;
import shop.tripn.oracle.publisher.service.PublisherService;

@Controller
public class PublisherController {
	@Autowired PublisherService publisherService;
	
	@RequestMapping("/publishers")
	public void findAll() {
		List<PublisherDto> pubs = publisherService.findAll();
		for(PublisherDto pub : pubs) {
			System.out.println(pub.toString());
		}
	}
	@RequestMapping("/publishers/pubId/{pubId}")
	public void findById(@PathVariable int pubId) {
		PublisherDto custs = publisherService.findById(pubId);
	}
}
