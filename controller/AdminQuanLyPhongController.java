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
import model.KhuVucModel;
import model.PhongModel;
import model.ThongBaoModel;

public class AdminQuanLyPhongController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminQuanLyPhongController() {
        super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		KhuVucModel kvModel = new KhuVucModel();
		PhongModel pModel = new PhongModel();
		String strMaKhuVuc = request.getParameter("strMaKhuVuc");
		request.setAttribute("alKhuVuc",kvModel.getList());
		if(strMaKhuVuc!=""){
			request.setAttribute("strMaKhuVuc", strMaKhuVuc);
		}	
		request.setAttribute("alItem",pModel.getListByMaKhuVuc(strMaKhuVuc));
		RequestDispatcher rd = request.getRequestDispatcher("/admin/quanlyphong.jsp");
		rd.forward(request, response);
		
		
		
		
	}
}
