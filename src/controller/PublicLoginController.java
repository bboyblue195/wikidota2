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
public class PublicLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	public PublicLoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SinhVienModel svModel = new SinhVienModel();
		StringLib strLib = new StringLib();
		
		if (request.getParameter("submit") != null) {
			String mssv = request.getParameter("mssv");
			String password = request.getParameter("password");
			System.out.println("mssv "+mssv);
			System.out.println("password "+password);
			String pass_md5 = strLib.md5(password);
			SinhVien userSV = svModel.getSinhVienByMSSVPassword(mssv, pass_md5);
			if(userSV !=null){//login dung
				//tao session
				HttpSession session  = request.getSession();
				session.setAttribute("sSinhVien", userSV);	
				response.sendRedirect(request.getContextPath()+"/home");
				System.out.println("da login");
			}else{//login sai
				response.sendRedirect(request.getContextPath()+"/home");
			}
		} else {// luc ban dau
			RequestDispatcher rd = request.getRequestDispatcher("/home");
			rd.forward(request, response);
		}

	}

}
