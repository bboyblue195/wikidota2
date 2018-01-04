package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import bean.DangKyThue;
import bean.Phong;
import bean.SinhVien;
import lib.ConnectDbLb;

public class SinhVienModel {
	private Connection conn;
	private ConnectDbLb connectDbLb ;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public int getSumByRoom(String maPhong){
		connectDbLb = new ConnectDbLb();
		int sum = 0;
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql = "SELECT count(*) AS sum FROM sinh_vien WHERE ma_phong = '"
				+ maPhong+"'"
				;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				sum = rs.getInt("sum");	
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
		return sum;
	}

	public SinhVien getItem(String mssv) {
		connectDbLb = new ConnectDbLb();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		SinhVien item = null;
		String sql = "SELECT *,sv.ma_sv,sv.ma_lop,phong.ma_khu_vuc,lop.ma_khoa FROM sinh_vien AS sv  "
				+ " INNER JOIN lop on sv.ma_lop = lop.ma_lop "
				+" INNER JOIn khoa on khoa.ma_khoa = lop.ma_khoa "
				+ " INNER JOIN phong on phong.ma_phong = sv.ma_phong "
				+ " INNER JOIN khu_vuc as kv on kv.ma_khu_vuc = phong.ma_khu_vuc "
				+ "	WHERE ma_sv =  '"+mssv+"'"
				+ " LIMIT 1";
		System.out.println(sql);
		try {
			pst =conn.prepareStatement(sql);
			//pst.setString(1, mssv);
			rs = pst.executeQuery();
			if(rs.next()){
				item = new SinhVien(rs.getString("ma_sv"), rs.getString("ho"), rs.getString("ten"), rs.getString("gioi_tinh"), rs.getTimestamp("ngay_sinh"), rs.getString("ma_lop"),rs.getString("ten_lop"), rs.getString("sdt"), rs.getString("dia_chi"), rs.getString("ten_cha"), rs.getString("ten_me"), rs.getString("dtlhgd"), rs.getString("ma_phong"),rs.getString("ten_phong"), rs.getString("ma_khu_vuc"),rs.getString("ten_khu_vuc"), rs.getString("thoi_gian_dang_ky"),rs.getString("password"),rs.getString("ma_khoa"),rs.getString("ten_khoa"));
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

	public SinhVien getSinhVienByMSSVPassword(String mssv, String pass_md5) {
		connectDbLb = new ConnectDbLb();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		SinhVien item = null;
		String sql = "SELECT *,sv.ma_sv,sv.ma_lop,phong.ma_khu_vuc,lop.ma_khoa FROM sinh_vien AS sv  "
				+ " INNER JOIN lop on sv.ma_lop = lop.ma_lop "
				+" INNER JOIn khoa on khoa.ma_khoa = lop.ma_khoa "
				+ " INNER JOIN phong on phong.ma_phong = sv.ma_phong "
				+ " INNER JOIN khu_vuc as kv on kv.ma_khu_vuc = phong.ma_khu_vuc "
				+ "	WHERE ma_sv = ? && password =? "
				+ " LIMIT 1";
		SinhVien sv = null;
		try {
			pst =conn.prepareStatement(sql);
			pst.setString(1, mssv);
			pst.setString(2, pass_md5);
			rs = pst.executeQuery();
			if(rs.next()){
				item = new SinhVien(rs.getString("ma_sv"), rs.getString("ho"), rs.getString("ten"), rs.getString("gioi_tinh"), rs.getTimestamp("ngay_sinh"), rs.getString("ma_lop"),rs.getString("ten_lop"), rs.getString("sdt"), rs.getString("dia_chi"), rs.getString("ten_cha"), rs.getString("ten_me"), rs.getString("dtlhgd"), rs.getString("ma_phong"),rs.getString("ten_phong"), rs.getString("ma_khu_vuc"),rs.getString("ten_khu_vuc"), rs.getString("thoi_gian_dang_ky"),rs.getString("password"),rs.getString("ma_khoa"),rs.getString("ten_khoa"));
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
	public ArrayList<SinhVien> getListSinhVienByMaPhong(String maphong){
		connectDbLb = new ConnectDbLb();
		ArrayList<SinhVien> alSinhVien = new ArrayList<>();
		//mo connect
		conn = connectDbLb.getConnectMySQL();
		String sql = "SELECT *,sv.ma_sv,sv.ma_lop,phong.ma_khu_vuc,lop.ma_khoa FROM sinh_vien AS sv  "
				+ " INNER JOIN lop on sv.ma_lop = lop.ma_lop "
				+" INNER JOIn khoa on khoa.ma_khoa = lop.ma_khoa "
				+ " INNER JOIN phong on phong.ma_phong = sv.ma_phong "
				+ " INNER JOIN khu_vuc as kv on kv.ma_khu_vuc = phong.ma_khu_vuc "
				+ "	WHERE sv.ma_phong = '"+maphong+"'";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			System.out.println(sql);
			while(rs.next()){
				SinhVien item = new SinhVien(rs.getString("ma_sv"), rs.getString("ho"), rs.getString("ten"), rs.getString("gioi_tinh"), rs.getTimestamp("ngay_sinh"), rs.getString("ma_lop"),rs.getString("ten_lop"), rs.getString("sdt"), rs.getString("dia_chi"), rs.getString("ten_cha"), rs.getString("ten_me"), rs.getString("dtlhgd"), rs.getString("ma_phong"),rs.getString("ten_phong"), rs.getString("ma_khu_vuc"),rs.getString("ten_khu_vuc"), rs.getString("thoi_gian_dang_ky"),rs.getString("password"),rs.getString("ma_khoa"),rs.getString("ten_khoa"));
				alSinhVien.add(item);
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
		return alSinhVien;
	}
	public boolean isExistStudent(String maSV) {
		boolean check =false;
		connectDbLb = new ConnectDbLb();
		conn = connectDbLb.getConnectMySQL();
		String sql ="SELECT ma_sv FROM sinh_vien WHERE ma_sv =? LIMIT 1";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1,maSV);
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
	public boolean isCheckThuePhong(String maSV) {
		connectDbLb = new ConnectDbLb();
		conn = connectDbLb.getConnectMySQL();
		String sql ="SELECT ma_phong FROM sinh_vien WHERE ma_sv =? LIMIT 1";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1,maSV);
			rs = pst.executeQuery();
			if(rs.next()){
				String maphong = rs.getString("ma_phong");
				if("".equals(maphong)){
					return true;
				}
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
		return false;
	}

	public int setMaPhong(DangKyThue item) {
		int result =0;
		connectDbLb = new ConnectDbLb();
		conn = connectDbLb.getConnectMySQL();
		String sql = "UPDATE sinh_vien SET ma_phong=? WHERE ma_sv=? LIMIT 1";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, item.getMaPhong());
			pst.setString(2, item.getMaSV());
			pst.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
