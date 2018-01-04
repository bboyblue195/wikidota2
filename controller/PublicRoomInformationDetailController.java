package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Array;

import bean.BieuMau;
import bean.DienNuoc;
import bean.SinhVien;
import bean.ThongBao;
import lib.SVLib;
import model.BieuMauModel;
import model.DienNuocModel;
import model.KhuVucModel;
import model.PhongModel;
import model.SinhVienModel;
import model.ThongBaoModel;

public class PublicRoomInformationDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PublicRoomInformationDetailController() {
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
		String maphong = "";
		String thang=null;
		String nam=null;
		if(request.getParameter("maphong")!=null){
			maphong = request.getParameter("maphong");
			request.setAttribute("maphong", maphong);
		}
		if(request.getParameter("thang")!=null && request.getParameter("thang")!=""){
			thang = request.getParameter("thang");
			request.setAttribute("thang", thang);
		}
		if(request.getParameter("nam")!=null && request.getParameter("nam")!=""){
			nam = request.getParameter("nam");
			request.setAttribute("nam", nam);
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Timestamp timestamp = null;  
		Timestamp timestamp2 = null; 
		try {
			if(thang!=null && nam!=null){
				java.util.Date utilDate = formatter.parse(nam+"-"+thang+"-01");
				timestamp = new Timestamp(utilDate.getTime());
				int thang2 = 0;
				int nam2=0;
				if("1".equals("thang")){
					nam2 = Integer.parseInt(nam)-1;
					thang2=12;
				}else{
					thang2 = Integer.parseInt(thang)-1;
					nam2 = Integer.parseInt(nam);
				}
				java.util.Date utilDate2 = formatter.parse(nam2+"-"+thang2+"-01");
				timestamp2 = new Timestamp(utilDate2.getTime());
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		DienNuocModel diennuocModel = new DienNuocModel();
		DienNuoc diennuoc = null;
		DienNuoc diennuoc2 = null;
		ArrayList<DienNuoc> alDienNuoc = null;
		if(timestamp!=null){
			diennuoc = diennuocModel.getItem(maphong, timestamp);
			if(diennuoc!=null){
				alDienNuoc = new ArrayList<>();
				alDienNuoc.add(diennuoc);
					diennuoc2 = diennuocModel.getItem(maphong, timestamp2);
					if(diennuoc2!=null){
						alDienNuoc.add(diennuoc2);
					}
			}
			
		}
		
		request.setAttribute("alDienNuoc", alDienNuoc);
		SinhVienModel svModel = new SinhVienModel();
		ArrayList<SinhVien>alSinhVien = new ArrayList<>();
		if(maphong!=""){
			alSinhVien = svModel.getListSinhVienByMaPhong(maphong);
		}
		request.setAttribute("alSinhVien",alSinhVien);
		RequestDispatcher rd = request.getRequestDispatcher("/RoomInformationDetail.jsp");
		rd.forward(request, response);			
					
	}
}
