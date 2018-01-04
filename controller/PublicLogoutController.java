package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.SinhVien;
import lib.StringLib;
import model.SinhVienModel;


//@WebServlet("/AdminCatIndexController")
public class PublicLogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	public PublicLogoutController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("sSinhVien")!= null){
			//xoas session
			session.removeAttribute("sSinhVien");
			response.sendRedirect(request.getContextPath()+"/home");
		}else{
			response.sendRedirect(request.getContextPath()+"/home");
		}
	}

}
