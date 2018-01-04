package controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DienNuoc;
import lib.SVLib;
import model.AdminModel;
import model.BieuMauModel;
import model.DienNuocModel;
import model.ThongBaoModel;

public class Admintest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Admintest() {
        super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		if(SVLib.isLogin(request, response)){
//			request.setAttribute("login", true);
//		}	
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Timestamp timestamp = null;  
		try {
			java.util.Date utilDate = formatter.parse("2017-01-01");
			timestamp = new Timestamp(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		DienNuocModel diennuocModel = new DienNuocModel();
		if(timestamp!=null){
			DienNuoc item = diennuocModel.getItem("mp01", timestamp);
			System.out.println(item.toString());
		}
	}
}
