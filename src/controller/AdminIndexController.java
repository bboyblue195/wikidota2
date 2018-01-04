package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lib.SVLib;
import model.AdminModel;
import model.BieuMauModel;
import model.ThongBaoModel;

public class AdminIndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminIndexController() {
        super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		if(SVLib.isLogin(request, response)){
//			request.setAttribute("login", true);
//		}	
		AdminModel adminModel = new AdminModel();
		request.setAttribute("alAdmin", adminModel.getList());
		RequestDispatcher rd = request.getRequestDispatcher("/admin/index.jsp");
		rd.forward(request, response);
	}
}
