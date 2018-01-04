package controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DangKyThue;
import lib.SVLib;
import model.DangKyThueModel;
import model.KhuVucModel;
import model.PhongModel;
import model.SinhVienModel;

public class PublicDangKyPhongController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PublicDangKyPhongController() {
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
		SinhVienModel svModel = new SinhVienModel();
		if (request.getParameter("submit") != null) {
			String mssv = request.getParameter("mssv");
			String maphong = request.getParameter("selectPhong");
			if(svModel.isExistStudent(mssv)&&svModel.isCheckThuePhong(mssv)){
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				DangKyThue dkt = new DangKyThue(0, mssv, maphong, timestamp);
				DangKyThueModel dktModel = new DangKyThueModel();
				int check = dktModel.addItem(dkt);
				if(check==1){
					request.setAttribute("msg", "1");
				}else{
					request.setAttribute("msg", "3"	);
				}
				
			}else{
				request.setAttribute("msg", "0");
			}
			
		}
		KhuVucModel kvModel = new KhuVucModel();
		PhongModel pModel = new PhongModel();
		String strMaKhuVuc = request.getParameter("strMaKhuVuc");
		String strMaPhong = request.getParameter("strMaPhong");
		request.setAttribute("alKhuVuc",kvModel.getList());
		if(strMaKhuVuc!=""){
			request.setAttribute("strMaKhuVuc", strMaKhuVuc);
		}
		if(strMaPhong!=""){
			request.setAttribute("strMaPhong", strMaPhong);
		}
		request.setAttribute("strMaPhong", strMaPhong);
		request.setAttribute("alItem",pModel.getListByMaKhuVuc(strMaKhuVuc));
		RequestDispatcher rd = request.getRequestDispatcher("/DangKyPhong.jsp");
		rd.forward(request, response);	
	}
}
