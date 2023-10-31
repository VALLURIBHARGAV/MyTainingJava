package webmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@GetMapping(value="/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello From Swati Jaiswal) ";
	}

}
