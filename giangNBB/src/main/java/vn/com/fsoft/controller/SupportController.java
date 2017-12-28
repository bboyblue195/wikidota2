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
public class SupportController{
	
	
	
	@RequestMapping(value = "/support", method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest arg0, HttpServletResponse arg1){
		// TODO Auto-generated method stub
		return new ModelAndView("support");
	}
	
//	@RequestMapping(value = "/handlingLogin", method=RequestMethod.POST)
//	public String handlingLogin(HttpServletRequest arg0, HttpServletResponse arg1m,RedirectAttributes redirectAttributes,
//	@RequestParam("user") String user,@RequestParam("pass") String pass, HttpSession session){
//
//		LoginDAO loginDAO = new LoginDAO();
//		UserDAO userDao = new UserDAO();
//		StringLib lib = new StringLib();
//		System.out.println(lib.md5("000"));
//		if(user == "" || pass == "") {
//			session.setAttribute("message", "1");
//			return "redirect:login";}
//		else if(loginDAO.checkLogin(user, lib.md5(pass))){
//			List<User> list = loginDAO.getInforIfLoginSucess(user);
//			session.setAttribute("name", list.get(0).getFirstName() + " " +list.get(0).getLastName());
//			//session.setAttribute("groupId", list.get(0).getGroupId());
//			
//			System.out.println(session.getAttribute("name"));
//			return "redirect:index";
//		}
//		else{
//			session.setAttribute("message", "2");
//			return "redirect:login";
//		}
//	}
}
