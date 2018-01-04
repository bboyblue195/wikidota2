package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DangKyThue;
import model.DangKyThueModel;
import model.SinhVienModel;

public class AdminQuanLyDangKyThueDuyetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminQuanLyDangKyThueDuyetController() {
        super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		try{
			SinhVienModel svModel = new SinhVienModel();
			DangKyThueModel dktModel = new DangKyThueModel();
			if(request.getParameter("submitduyet")!=null){
				String [] listMaDangKyThueDuyet = request.getParameterValues("duyet");
				for(int i=0; i <listMaDangKyThueDuyet.length; i++ ){
					int maDKT= Integer.parseInt(listMaDangKyThueDuyet[i]);
					DangKyThue item = dktModel.getItem(maDKT);
					System.out.println("dsdsa");
					int check = svModel.setMaPhong(item);
					if(check==1){
						dktModel.delItem(item);
					}
				}
				response.sendRedirect(request.getContextPath()+"/admin/quanlydangkythue?msg=1");
			}else if(request.getParameter("submitkhongduyet")!=null){
				String [] listMaDangKyThueKhongDuyet = request.getParameterValues("khongduyet");
				for(int i=0; i <listMaDangKyThueKhongDuyet.length; i++ ){
					int maDKT= Integer.parseInt(listMaDangKyThueKhongDuyet[i]);
					DangKyThue item = dktModel.getItem(maDKT);
					System.out.println("dsdsa");
					dktModel.delItem(item);
				}
				response.sendRedirect(request.getContextPath()+"/admin/quanlydangkythue?msg=1");
			}else{
				response.sendRedirect(request.getContextPath()+"/admin/quanlydangkythue");
			}
		}catch(Exception e){
			RequestDispatcher rd = request.getRequestDispatcher("/admin/quanlydangkythue");
			rd.forward(request, response);
		}
		
		
	}
}
