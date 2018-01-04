package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import bean.DangKyThue;
import lib.ConnectDbLb;

public class DangKyThueModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ArrayList<DangKyThue> getListByKhuVuc(String makhuvuc){
		connectDbLb = new ConnectDbLb();
		ArrayList<DangKyThue> alDangKyThue = null;
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql ="";
		if(makhuvuc!=null){
			sql="SELECT *,dkt.ma_phong,phong.ma_khu_vuc FROM dang_ky_thue AS dkt  "
					+ " INNER JOIN phong ON phong.ma_phong = dkt.ma_phong "
					+ " INNER JOIN khu_vuc as kv ON phong.ma_khu_vuc = kv.ma_khu_vuc "
					+ " INNER JOIN sinh_vien as sv ON sv.ma_sv = dkt.ma_sv "
					+" WHERE phong.ma_khu_vuc = '"+makhuvuc+"'"
					//+" LIMIT "+limit
					;
		}else{
			sql="SELECT *,dkt.ma_phong,phong.ma_khu_vuc FROM dang_ky_thue AS dkt  "
					+ " INNER JOIN phong ON phong.ma_phong = dkt.ma_phong "
					+ " INNER JOIN khu_vuc as kv ON phong.ma_khu_vuc = kv.ma_khu_vuc "
					+ " INNER JOIN sinh_vien as sv ON sv.ma_sv = dkt.ma_sv "
					//+" LIMIT "+limit
					;
		}
		 System.out.println("sql "+sql);
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				alDangKyThue = new ArrayList<>();
				DangKyThue dkt = new DangKyThue(rs.getInt("ma_dang_ky_thue"), rs.getString("ma_sv"), rs.getString("phong.ma_phong"), rs.getTimestamp("thoi_gian"), rs.getString("ho"), rs.getString("ten"), rs.getString("ten_phong"), rs.getString("kv.ma_khu_vuc"), rs.getString("ten_khu_vuc"), 0);
				alDangKyThue.add(dkt);
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
		return alDangKyThue;
	}

	public boolean isCheckKhuVuc(int cid) {
		boolean check =false;
		connectDbLb = new ConnectDbLb();
		conn = connectDbLb.getConnectMySQL();
		String sql ="SELECT id_cat FROM news WHERE id_cat =? LIMIT 1";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1,cid);
			rs = pst.executeQuery();
			if(rs.next()){
				check = true;
			}
		} catch (SQLException e) {
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
		return check;
	}
//	public News getItem(int id) {

//	}



	
//	public ArrayList<Phong> getListByMaKhuVuc(String maKhuVuc){
//		connectDbLb = new ConnectDbLb();
//		ArrayList<Phong> alPhong = new ArrayList<>();
//		//mo connect
//		conn = connectDbLb.getConnectMySQL();
//		String sql ="";
//		if(maKhuVuc == null){
//			sql = "SELECT *,p.ma_khu_vuc FROM phong AS p  "
//					+ " INNER JOIN khu_vuc as kv USING(ma_khu_vuc)"
//					;
//		}else{
//			sql = "SELECT *,phong.ma_khu_vuc FROM phong "
//					+ " INNER JOIN khu_vuc as kv USING(ma_khu_vuc) "
//					+" WHERE ma_khu_vuc = '"+maKhuVuc+"'"
//					+" ORDER BY phong.ma_phong DESC "
//					;	
//		}
//		try {
//			st = conn.createStatement();
//			rs = st.executeQuery(sql);
//			while(rs.next()){
//				Phong item = new Phong(rs.getString("ma_phong"),rs.getString("ten_phong"),rs.getString("ma_khu_vuc"),rs.getString("ten_khu_vuc"),rs.getInt("muc_gia"));
//				alPhong.add(item);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			try {
//				st.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			//dong connect
//			connectDbLb.closeConnect();
//		}
//		return alPhong;
//	}
		
	
	
//	public int updateItem(News item) {
//		int result =0;
//		connectDbLb = new ConnectDbLb();
//		conn = connectDbLb.getConnectMySQL();
//	
//		String sql = "UPDATE dang_ky_thue SET ma_dang_ky_thue=?,ma_phong=?,ma_sv=?,thoi_gian=? WHERE id_news=? LIMIT 1";
//		try {
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, item.getName());
//			pst.setString(2, item.getPreview_text());
//			pst.setString(3, item.getDetail_text());
//			pst.setInt(4, item.getId_cat());
//			pst.setString(5, item.getPictures());
//			
//			pst.setInt(6, item.getId_news());
//			pst.executeUpdate();
//			result = 1;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			try {
//				pst.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			connectDbLb.closeConnect();
//		}
//		return result;
//	}
	
	
	public int addItem(DangKyThue item) {
		int result =0;
		connectDbLb = new ConnectDbLb();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql ="INSERT INTO dang_ky_thue(ma_dang_ky_thue,ma_sv,ma_phong,thoi_gian) VALUES(?,?,?,?)";
		try {
			pst =conn.prepareStatement(sql);
			pst.setInt(1, item.getMaDangKyThue());
			pst.setString(2, item.getMaSV());
			pst.setString(3, item.getMaPhong());
			pst.setTimestamp(4, item.getThoiGian());
			pst.executeUpdate();
			result = 1;
		} catch (SQLException e) {
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

	public DangKyThue getItem(int maDKT) {
		connectDbLb = new ConnectDbLb();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		DangKyThue item = null;
		String sql="SELECT *,dkt.ma_phong,phong.ma_khu_vuc FROM dang_ky_thue AS dkt  "
				+ " INNER JOIN phong ON phong.ma_phong = dkt.ma_phong "
				+ " INNER JOIN khu_vuc as kv ON phong.ma_khu_vuc = kv.ma_khu_vuc "
				+ " INNER JOIN sinh_vien as sv ON sv.ma_sv = dkt.ma_sv "
				+" WHERE ma_dang_ky_thue = ? "
				+" LIMIT 1 "
				;
		System.out.println("sql get: "+sql);
		try {
			pst =conn.prepareStatement(sql);
			pst.setInt(1, maDKT);
			rs = pst.executeQuery();
			if(rs.next()){
				item = new DangKyThue(rs.getInt("ma_dang_ky_thue"), rs.getString("ma_sv"), rs.getString("phong.ma_phong"), rs.getTimestamp("thoi_gian"), rs.getString("ho"), rs.getString("ten"), rs.getString("ten_phong"), rs.getString("ma_khu_vuc"), rs.getString("ten_khu_vuc"), 0);
			}
		} catch (SQLException e) {
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
		return item;
	}

	public int delItem(DangKyThue item) {
		int result = 0;
		connectDbLb = new ConnectDbLb();
		conn = connectDbLb.getConnectMySQL();
		String sql ="DELETE FROM dang_ky_thue WHERE ma_dang_ky_thue = ? LIMIT 1";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, item.getMaDangKyThue());
			pst.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			connectDbLb.closeConnect();
		}
		return result;
	}
}
