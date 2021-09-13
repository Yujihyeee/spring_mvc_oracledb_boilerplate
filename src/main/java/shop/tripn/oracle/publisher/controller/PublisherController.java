package shop.tripn.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.publisher.domain.PublisherDto;
import shop.tripn.oracle.publisher.service.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;
	
	@RequestMapping("/publishers")
	public void findAll() {
		List<PublisherDto> pubs = publisherService.findAll();
		for(PublisherDto pub : pubs) {
			System.out.println(pub.toString());
		}
	}
	@RequestMapping("/publishers/pubId/{pubId}")
	public void findById(@PathVariable int pubId) {
		PublisherDto pub = publisherService.findById(pubId);
		System.out.println(pub.toString());
	}
	@RequestMapping(value = "/join", method = {RequestMethod.POST})
	public String join(
			@RequestParam("pubId") int pubId,
			@RequestParam("pubName") String pubName,
			@RequestParam("mgrName") String mgrName,
			@RequestParam("phone") String phone) {
		System.out.println("pubId : " + pubId);
		System.out.println("pubName : " + pubName);
		System.out.println("mgrName : " + mgrName);
		System.out.println("phone : " + phone);
		publisher = new PublisherDto();
		publisher.setPubId(pubId);
		publisher.setPubName(pubName);
		publisher.setMgrName(mgrName);
		publisher.setPhone(phone);
		publisherService.save(publisher);
		return "입력 성공";
	}
}
