package vn.com.fsoft.controller;

import vn.com.fsoft.dao.LoginDAO;
import vn.com.fsoft.dao.UserDAO;
import vn.com.fsoft.model.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CareController {
	
	@RequestMapping(value = "/request", method=RequestMethod.GET)
	public ModelAndView displayRequest(HttpServletRequest arg0, HttpServletResponse arg1){
		// TODO Auto-generated method stub
		return new ModelAndView("request");
	}
	
	@RequestMapping(value = "/shop", method=RequestMethod.GET)
	public ModelAndView displayShop(HttpServletRequest arg0, HttpServletResponse arg1){
		// TODO Auto-generated method stub
		return new ModelAndView("shop");
	}
	
	@RequestMapping(value = "/signup", method=RequestMethod.GET)
	public ModelAndView displaySigup(HttpServletRequest arg0, HttpServletResponse arg1){
		// TODO Auto-generated method stub
		return new ModelAndView("signup");
	}
	
	@RequestMapping(value = "/tandp", method=RequestMethod.GET)
	public ModelAndView displayTandp(HttpServletRequest arg0, HttpServletResponse arg1){
		// TODO Auto-generated method stub
		return new ModelAndView("tandp");
	}
	
	@RequestMapping(value = "/admin", method=RequestMethod.GET)
	public ModelAndView displayAdmin(HttpServletRequest arg0, HttpServletResponse arg1){
		// TODO Auto-generated method stub
		return new ModelAndView("admin");
	}
	
	@RequestMapping(value = "/forgot", method=RequestMethod.GET)
	public ModelAndView displayforgot(HttpServletRequest arg0, HttpServletResponse arg1){
		// TODO Auto-generated method stub
		return new ModelAndView("forgot");
	}
}
