package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculation;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class CalculationController {
	
	@RequestMapping(value="lti",params="add")  
	public ModelAndView
	addData(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute Calculation calc) throws Exception
	{  
		calc.setSum(calc.getNo1()+calc.getNo2());
		calc.setMsg("Add is ");
		return new ModelAndView("Calc","message",calc);  
	}  
	@RequestMapping(value="lti",params="sub")  
	public ModelAndView
	subData(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute Calculation calc) throws Exception
	{  
		calc.setSum(calc.getNo1()-calc.getNo2());
		calc.setMsg("Sub is ");
		return new ModelAndView("Calc","message",calc);  
	}  
}
