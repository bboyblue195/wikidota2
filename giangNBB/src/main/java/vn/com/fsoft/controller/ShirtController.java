package vn.com.fsoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vn.com.fsoft.dao.ShirtDAO;
import vn.com.fsoft.model.FileUploadForm;
import vn.com.fsoft.model.Shirt;
import vn.com.fsoft.model.User;

@Controller
public class ShirtController {
//	@RequestMapping(value="/handlingindex",method=RequestMethod.GET)
//	public String handlingLogin(HttpServletRequest arg0, HttpServletResponse arg1m,RedirectAttributes redirectAttributes,
//	HttpSession session){
//		
//	ShirtDAO shirtDao = new ShirtDAO();
//	List<Shirt> List = shirtDao.getList();
//	session.setAttribute("giang",List);	
//	
//	return "redirect:index";
//	}
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView index(HttpSession session) {
		ShirtDAO shirtDao = new ShirtDAO();
		List<Shirt> List = shirtDao.getList();
		session.setAttribute("giang",List);	
	return new ModelAndView("index");
	}
}
