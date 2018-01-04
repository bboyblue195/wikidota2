package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lib.SVLib;
import model.BieuMauModel;
import model.NhanVienModel;
import model.ThongBaoModel;

public class PublicDanhSachCanBoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PublicDanhSachCanBoController() {
        super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(SVLib.isLogin(request, response)){
			request.setAttribute("login", true);
		}	
		NhanVienModel nvModel = new NhanVienModel();
		request.setAttribute("alNhanVien", nvModel.getList());
		RequestDispatcher rd = request.getRequestDispatcher("/DanhSachCanBo.jsp");
		rd.forward(request, response);
	}
}
