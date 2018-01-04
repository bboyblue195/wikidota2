package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.SinhVien;
import lib.SVLib;
import lib.StringLib;
import model.BieuMauModel;
import model.KhuVucModel;
import model.PhongModel;
import model.SinhVienModel;
import model.ThongBaoModel;

public class PublicCaNhanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PublicCaNhanController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(SVLib.isLogin(request, response)){
			request.setAttribute("login", true);
			HttpSession session = request.getSession();
			SinhVien sSinhVien =(SinhVien)session.getAttribute("sSinhVien");
			request.setAttribute("sv", sSinhVien);
			RequestDispatcher rd = request.getRequestDispatcher("/CaNhan.jsp");
			rd.forward(request, response);
			
		}else{
			response.sendRedirect(request.getContextPath()+"/home");
		}
		
	}
}
