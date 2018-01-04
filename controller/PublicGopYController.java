package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.GopY;
import bean.SinhVien;
import lib.SVLib;
import model.BieuMauModel;
import model.GopYModel;
import model.NhanVienModel;
import model.ThongBaoModel;

public class PublicGopYController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PublicGopYController() {
        super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(SVLib.isLogin(request, response)){
			request.setAttribute("login", true);
		}	
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		if (request.getParameter("submit") != null) {
			String hoten = request.getParameter("hoten");
			String email = request.getParameter("email");
			String noidung = request.getParameter("noidung");
			System.out.println(hoten);
			GopY gy = new GopY(0, hoten, email, noidung);
			GopYModel gyModel = new GopYModel();
			if(gy !=null){
				if(gyModel.addItem(gy)==1){
					RequestDispatcher rd = request.getRequestDispatcher("/GopY.jsp?msg=1");
					rd.forward(request, response);
				}else{
					RequestDispatcher rd = request.getRequestDispatcher("/GopY.jsp?msg=0");
					rd.forward(request, response);
				}
				
			}else{
				response.sendRedirect(request.getContextPath()+"/GopY.jsp?msg=0");
			}
		} else {// luc ban dau
			RequestDispatcher rd = request.getRequestDispatcher("/GopY.jsp");
			rd.forward(request, response);
		}
	}
}
