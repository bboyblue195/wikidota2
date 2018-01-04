package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.KhuVuc;
import lib.ConnectDbLb;

public class KhuVucModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ArrayList<KhuVuc> getList(){
		connectDbLb = new ConnectDbLb();
		ArrayList<KhuVuc> alKhuVuc = new ArrayList<>();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql ="SELECT * FROM khu_vuc "
				+ " ORDER BY ma_khu_vuc ASC";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				KhuVuc kv = new KhuVuc(rs.getString("ma_khu_vuc"),rs.getString("ten_khu_vuc"));
				alKhuVuc.add(kv);
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
		return alKhuVuc;
	}
	public KhuVuc getItem(int makhuvuc){
		connectDbLb = new ConnectDbLb();
		KhuVuc item = new KhuVuc();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql ="SELECT * FROM khu_vuc WHERE ma_khu_vuc = "+makhuvuc;
				
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				item = new KhuVuc(rs.getString("ma_khu_vuc"),rs.getString("ten_khu_vuc"));
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
		return item;
	}	
}
