package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lib.SVLib;
import model.BieuMauModel;
import model.ThongBaoModel;

public class PublicThongBaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PublicThongBaoController() {
        super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(SVLib.isLogin(request, response)){
			request.setAttribute("login", true);
		}	

		if(request.getParameter("matb")!=null){
			request.setAttribute("matb",request.getParameter("matb"));
		}	
		if(request.getParameter("mabm")!=null){
			request.setAttribute("mabm",request.getParameter("mabm"));
		}
		ThongBaoModel thongbaoModel = new ThongBaoModel();
		BieuMauModel bieumauModel = new BieuMauModel();
		//ArrayList<BieuMau> alBieuMau = bieumauModel.getListThongBao(4);
		request.setAttribute("alThongBao",thongbaoModel.getListThongBao(10));
		request.setAttribute("alBieuMau", bieumauModel.getListBieuMau(4));
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}
}
