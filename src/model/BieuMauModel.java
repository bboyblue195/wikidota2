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

public class BieuMauModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ArrayList<BieuMau> getListBieuMau(int limit){
		connectDbLb = new ConnectDbLb();
		ArrayList<BieuMau> alBieuMau = new ArrayList<>();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql = "SELECT ma_bieu_mau,noi_dung FROM bieu_mau "
				+" LIMIT "+limit
				;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				BieuMau bm = new BieuMau(rs.getString("ma_bieu_mau"),rs.getString("noi_dung"));
				alBieuMau.add(bm);
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
		return alBieuMau;
	}
	
}
