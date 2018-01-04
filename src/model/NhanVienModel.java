package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import bean.KhuVuc;
import bean.NhanVien;
import bean.Phong;
import bean.SinhVien;
import lib.ConnectDbLb;

public class NhanVienModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ArrayList<NhanVien> getList(){
		connectDbLb = new ConnectDbLb();
		ArrayList<NhanVien> alNhanVien = new ArrayList<>();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql ="SELECT *,nv.ma_chuc_vu FROM nhan_vien as nv "
				+" INNER JOIN chuc_vu as cv ON nv.ma_chuc_vu = cv.ma_chuc_vu "
				+ " ORDER BY ma_nv ASC";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				NhanVien nv = new NhanVien(rs.getString("ma_nv"),rs.getString("ho"), rs.getString("ten"),rs.getString("gioi_tinh"), rs.getTimestamp("ngay_sinh"), rs.getString("ma_chuc_vu"),rs.getString("ten_chuc_vu"), rs.getString("sdt"),rs.getString("dia_chi") ,rs.getString("ten_cha"), rs.getString("ten_me"), rs.getString("dtlhgd"), rs.getString("username"), rs.getString("password"));
				alNhanVien.add(nv);
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
		return alNhanVien;
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
	



	
	


	
}
