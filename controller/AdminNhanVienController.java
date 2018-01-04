package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DangKyThue;
import model.DangKyThueModel;
import model.KhuVucModel;
import model.PhongModel;
import model.SinhVienModel;

public class AdminNhanVienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminNhanVienController() {
        super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		//request.setAttribute("alItem",pModel.getListByMaKhuVuc(strMaKhuVuc));
		RequestDispatcher rd = request.getRequestDispatcher("/admin/quanlynhanvien.jsp");
		rd.forward(request, response);
		
		
		
		
	}
}
