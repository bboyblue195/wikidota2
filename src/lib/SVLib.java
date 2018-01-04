package lib;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.SinhVien;


public class SVLib  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public static boolean isLogin(HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		SinhVien sSinhVien =(SinhVien)session.getAttribute("sSinhVien");
		if(sSinhVien == null){//chua login
			//response.sendRedirect(request.getContextPath()+"/home");
			return false;
		}
		return true;
	}
}
