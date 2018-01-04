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
import model.KhuVucModel;
import model.PhongModel;
import model.ThongBaoModel;

public class PublicRoomInformationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PublicRoomInformationController() {
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
		KhuVucModel kvModel = new KhuVucModel();
		PhongModel pModel = new PhongModel();
		String strMaKhuVuc = request.getParameter("strMaKhuVuc");
		request.setAttribute("alKhuVuc",kvModel.getList());
		if(strMaKhuVuc!=""){
			request.setAttribute("strMaKhuVuc", strMaKhuVuc);
		}	
		request.setAttribute("alItem",pModel.getListByMaKhuVuc(strMaKhuVuc));
		RequestDispatcher rd = request.getRequestDispatcher("/RoomInformation.jsp");
		rd.forward(request, response);			
					
	}
}
