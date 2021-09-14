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
	
	@RequestMapping("book/detail") 
	  public String BookDetail() { 
		  return "/books/Detail"; 
		  }
	  @RequestMapping("book/register") 
	  public String BookRegister() { 
		  return "/books/Register"; 
		  }
	  @RequestMapping("book/update") 
	  public String BookUpdate() { 
		  return "/books/Update"; 
		  }
	  @RequestMapping("book/update") 
	  public String BookList() { 
		  return "/books/List"; 
		  }
	
	  @RequestMapping("customer/join") 
	  public String Join() { 
		  return "/customers/Join"; 
	  }
	  @RequestMapping("customer/login") 
	  public String Login() { 
		  return "/customers/Login"; 
		  }
	  @RequestMapping("customer/detail") 
	  public String Detail() { 
		  return "/customers/Detail"; 
		  }
	  @RequestMapping("customer/register") 
	  public String Register() { 
		  return "/customers/Register"; 
		  }
	  @RequestMapping("customer/update") 
	  public String Update() { 
		  return "/customers/Update"; 
		  }
	 
	  @RequestMapping("order/detail") 
	  public String OrderDetail() { 
		  return "/orders/Detail"; 
		  }
	  @RequestMapping("order/register") 
	  public String OrderRegister() { 
		  return "/orders/Register"; 
		  }
	  @RequestMapping("order/update") 
	  public String OrderUpdate() { 
		  return "/orders/Update"; 
		  }
	  @RequestMapping("order/update") 
	  public String OrderList() { 
		  return "/orders/List"; 
		  }
	  
	  @RequestMapping("publisher/detail") 
	  public String PublisherDetail() { 
		  return "/publishers/Detail"; 
		  }
	  @RequestMapping("publisher/register") 
	  public String PublisherRegister() { 
		  return "/publishers/Register"; 
		  }
	  @RequestMapping("publisher/update") 
	  public String PublisherUpdate() { 
		  return "/publishers/Update"; 
		  }
	  @RequestMapping("publisher/update") 
	  public String PublisherList() { 
		  return "/publishers/List"; 
		  }
}