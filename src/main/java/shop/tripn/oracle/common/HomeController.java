package shop.tripn.oracle.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

// Method 
@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(
			HttpSession session,
			HttpServletRequest request) {
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath );
		return "index";
	}
	
	@RequestMapping("/books/detail") 
	  public String BookDetail() { 
		  return "/books/Detail"; 
		  }
	  @RequestMapping("/books/register") 
	  public String BookRegister() { 
		  return "/books/Register"; 
		  }
	  @RequestMapping("/books/update") 
	  public String BookUpdate() { 
		  return "/books/Update"; 
		  }
	  @RequestMapping("/books/list") 
	  public String BookList() { 
		  return "/books/List"; 
		  }
	
	  @RequestMapping("/customers/join") 
	  public String Join() { 
		  return "/customers/Join"; 
	  }
	  @RequestMapping("/customers/login") 
	  public String Login() { 
		  return "/customers/Login"; 
		  }
	  @RequestMapping("/customers/detail") 
	  public String Detail() { 
		  return "/customers/Detail"; 
		  }
	  @RequestMapping("/customers/register") 
	  public String Register() { 
		  return "/customers/Register"; 
		  }
	  @RequestMapping("/customers/update") 
	  public String Update() { 
		  return "/customers/Update"; 
		  }
	 
	  @RequestMapping("/orders/detail") 
	  public String OrderDetail() { 
		  return "/orders/Detail"; 
		  }
	  @RequestMapping("/orders/register") 
	  public String OrderRegister() { 
		  return "/orders/Register"; 
		  }
	  @RequestMapping("/orders/update") 
	  public String OrderUpdate() { 
		  return "/orders/Update"; 
		  }
	  @RequestMapping("/orders/list") 
	  public String OrderList() { 
		  return "/orders/List"; 
		  }
	  
	  @RequestMapping("/publishers/detail") 
	  public String PublisherDetail() { 
		  return "/publishers/Detail"; 
		  }
	  @RequestMapping("/publishers/register") 
	  public String PublisherRegister() { 
		  return "/publishers/Register"; 
		  }
	  @RequestMapping("/publishers/update") 
	  public String PublisherUpdate() { 
		  return "/publishers/Update"; 
		  }
	  @RequestMapping("/publishers/list") 
	  public String PublisherList() { 
		  return "/publishers/List"; 
		  }
}