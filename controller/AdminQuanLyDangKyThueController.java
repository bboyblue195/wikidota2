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

public class AdminQuanLyDangKyThueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminQuanLyDangKyThueController() {
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
		SinhVienModel svMdodel = new SinhVienModel();
		String strMaKhuVuc = request.getParameter("strMaKhuVuc");
		request.setAttribute("alKhuVuc",kvModel.getList());
		request.setAttribute("strMaKhuVuc", strMaKhuVuc);
		DangKyThueModel dktModel = new DangKyThueModel();
		ArrayList<DangKyThue> alDangKyThue  = dktModel.getListByKhuVuc(strMaKhuVuc);
		if(alDangKyThue!=null){
			for (DangKyThue dangKyThue : alDangKyThue) {
				int sumsv = svMdodel.getSumByRoom(dangKyThue.getMaPhong());
				dangKyThue.setSoLuongTrong(8-sumsv);
			}
		}
		request.setAttribute("alDangKyThue", alDangKyThue);
		//request.setAttribute("alItem",pModel.getListByMaKhuVuc(strMaKhuVuc));
		RequestDispatcher rd = request.getRequestDispatcher("/admin/quanlydangkythue.jsp");
		rd.forward(request, response);
		
		
		
		
	}
}
