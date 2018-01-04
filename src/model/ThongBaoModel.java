package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.ThongBao;
import lib.ConnectDbLb;

public class ThongBaoModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ArrayList<ThongBao> getListThongBao(int limit){
		connectDbLb = new ConnectDbLb();
		ArrayList<ThongBao> alThongBao = new ArrayList<>();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql = "SELECT ma_thong_bao,tieu_de,noi_dung,thoi_gian FROM thong_bao "
				+" LIMIT "+limit
				;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				ThongBao tb = new ThongBao(rs.getString("ma_thong_bao"),rs.getString("tieu_de"),rs.getString("noi_dung"),rs.getTimestamp("thoi_gian"));
				alThongBao.add(tb);
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
		return alThongBao;
	}
	
}
