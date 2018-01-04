package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.BieuMau;
import bean.ThongBao;
import lib.ConnectDbLb;

public class GioiThieuModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public String getGioiThieu(){
		connectDbLb = new ConnectDbLb();
		String gioithieu ="";
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql = "SELECT noi_dung FROM gioi_thieu "
				+" LIMIT 1 "
				;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				gioithieu = rs.getString("noi_dung");
				return gioithieu;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//dong connect
			connectDbLb.closeConnect();
		}
		return gioithieu;
	}
	
}
