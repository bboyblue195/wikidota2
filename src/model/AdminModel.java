package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import bean.Admin;
import bean.KhuVuc;
import bean.NhanVien;
import bean.Phong;
import bean.SinhVien;
import lib.ConnectDbLb;

public class AdminModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ArrayList<Admin> getList(){
		connectDbLb = new ConnectDbLb();
		ArrayList<Admin> alAdmin = new ArrayList<>();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql ="SELECT *  FROM admin "
				+ " ORDER BY ma_admin ASC";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Admin item = new Admin(rs.getString("ma_admin"), rs.getString("username"), rs.getString("password"), rs.getString("ho"), rs.getString("ten"));	
				alAdmin.add(item);
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
		return alAdmin;
	}



	
}
