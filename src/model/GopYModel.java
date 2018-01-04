package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.BieuMau;
import bean.GopY;
import bean.ThongBao;
import lib.ConnectDbLb;

public class GopYModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public int addItem(GopY gy){
		connectDbLb = new ConnectDbLb();
		int result = 0;
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql = "INSERT INTO gop_y(ho_ten,email,noi_dung) VALUES(?,?,?)";
		
		try {
			pst =conn.prepareStatement(sql);
			pst.setString(1, gy.getHo_ten());
			pst.setString(2, gy.getEmail());
			pst.setString(3, gy.getNoiDung());
			pst.executeUpdate();
			System.out.println("sql "+sql);
			result = 1;
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//dong connect
			connectDbLb.closeConnect();
		}
		return result;
	}
	
}
