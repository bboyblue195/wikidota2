package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BieuMau;
import bean.ThongBao;
import lib.SVLib;
import model.BieuMauModel;
import model.GioiThieuModel;
import model.ThongBaoModel;

public class PublicIntroductionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PublicIntroductionController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		if(SVLib.isLogin(request, response)){
			request.setAttribute("login", true);
		}
		ThongBaoModel thongbaoModel = new ThongBaoModel();
		BieuMauModel bieumauModel = new BieuMauModel();
		//ArrayList<BieuMau> alBieuMau = bieumauModel.getListThongBao(4);
		request.setAttribute("alThongBao",thongbaoModel.getListThongBao(10));
		request.setAttribute("alBieuMau", bieumauModel.getListBieuMau(4));
		GioiThieuModel gioithieuModel = new GioiThieuModel();
		request.setAttribute("gioithieu",gioithieuModel.getGioiThieu());
		RequestDispatcher rd = request.getRequestDispatcher("/gioithieu.jsp");
		rd.forward(request, response);
					
	}
}
