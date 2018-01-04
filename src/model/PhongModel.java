package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Phong;
import lib.ConnectDbLb;

public class PhongModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ArrayList<Phong> getList(int limit){
		connectDbLb = new ConnectDbLb();
		ArrayList<Phong> alPhong = new ArrayList<>();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql = "SELECT *,p.ma_khu_vuc FROM phong AS p  "
				+ " INNER JOIN khu_vuc as kv USING(ma_khu_vuc)"
				+" LIMIT "+limit
				;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Phong item = new Phong(rs.getString("ma_phong"),rs.getString("ten_phong"),rs.getString("ma_khu_vuc"),rs.getString("ten_khu_vuc"),rs.getInt("muc_gia"));
				alPhong.add(item);
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
		return alPhong;
	}

//	public boolean isExistNewsCat(int cid) {
//		boolean check =false;
//		connectDbLb = new ConnectDbLb();
//		conn = connectDbLb.getConnectMySQL();
//		String sql ="SELECT id_cat FROM news WHERE id_cat =? LIMIT 1";
//		try {
//			pst = conn.prepareStatement(sql);
//			pst.setInt(1,cid);
//			rs = pst.executeQuery();
//			if(rs.next()){
//				check = true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			try {
//				pst.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			//dong connect
//			connectDbLb.closeConnect();
//		}
//		return check;
//	}
//	public News getItem(int id) {
//		connectDbLb = new ConnectDbLb();
//		//mo connect
//		conn = connectDbLb.getConnectMySQL();
//		News item = null;
//		String sql = "SELECT *,n.name AS nname, c.name AS cname,u.fullname AS ufullname FROM news AS n  "
//				+ " INNER JOIN category as c USING(id_cat) "
//				+ " INNER JOIN users as u USING(username)"
//				+ "	WHERE id_news =? "
//				+ " LIMIT 1";
//		
//		try {
//			pst =conn.prepareStatement(sql);
//			pst.setInt(1, id);
//			rs = pst.executeQuery();
//			if(rs.next()){
//				item = new News(rs.getInt("id_news"),rs.getString("nname"),rs.getString("preview_text"),rs.getString("detail_text"),rs.getString("picture"),rs.getInt("id_cat"),rs.getString("cname"),rs.getString("username"),rs.getString("fullname"),rs.getString("date_create"),rs.getInt("quantam"),rs.getInt("view"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			try {
//				pst.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			//dong connect
//			connectDbLb.closeConnect();
//		}
//		return item;
//	}



	
	public ArrayList<Phong> getListByMaKhuVuc(String maKhuVuc){
		connectDbLb = new ConnectDbLb();
		ArrayList<Phong> alPhong = new ArrayList<>();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql ="";
		if(maKhuVuc == null){
			sql = "SELECT *,p.ma_khu_vuc FROM phong AS p  "
					+ " INNER JOIN khu_vuc as kv USING(ma_khu_vuc)"
					;
		}else{
			sql = "SELECT *,phong.ma_khu_vuc FROM phong "
					+ " INNER JOIN khu_vuc as kv USING(ma_khu_vuc) "
					+" WHERE ma_khu_vuc = '"+maKhuVuc+"'"
					+" ORDER BY phong.ma_phong DESC "
					;	
		}
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Phong item = new Phong(rs.getString("ma_phong"),rs.getString("ten_phong"),rs.getString("ma_khu_vuc"),rs.getString("ten_khu_vuc"),rs.getInt("muc_gia"));
				alPhong.add(item);
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
		return alPhong;
	}
	
}
