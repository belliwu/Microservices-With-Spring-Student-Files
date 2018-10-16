package edume.bootsolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController = @ResponseBody + @Controller and return JSON format  
@Controller
public class HelloController
{
	@GetMapping("/")
	public String sayHi()
	{
		//mapping '/resourece/templates/hello.html'
		return "hello";
	}
}
