package com.mypack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController{
	
	@RequestMapping("/hello1")
	public ModelAndView helloworld1()
	{
		String message="Hello Spring MVC";
		return new ModelAndView("display", "Ramesh", message);
	}

	
	@RequestMapping("/hello2")
	public ModelAndView helloworld2()
	{
		String message="Hello Spring MVC";
		return new ModelAndView("display", "suresh", message);
	}
	
}
