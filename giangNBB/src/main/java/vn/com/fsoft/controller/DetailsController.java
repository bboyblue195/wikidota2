package vn.com.fsoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lib.StringLib;
import vn.com.fsoft.dao.LoginDAO;
import vn.com.fsoft.dao.UserDAO;
import vn.com.fsoft.model.User;

@Controller
public class DetailsController{	
	@RequestMapping(value = "/details", method=RequestMethod.GET)
	public ModelAndView handlingLogin(HttpServletRequest arg0, HttpServletResponse arg1m,RedirectAttributes redirectAttributes,
			@RequestParam("shirtId") String shirtid,HttpSession session){
		// TODO Auto-generated method stub
		
		session.setAttribute("sid",shirtid);	
		return new ModelAndView("details");
	}
	

}


