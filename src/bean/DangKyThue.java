package bean;

import java.sql.Timestamp;

public class DangKyThue {
	private int maDangKyThue; 
	private String maSV;
	private String maPhong;
	private Timestamp thoiGian;
	private String ho;
	private String ten;
	private String tenPhong;
	private String maKhuVuc;
	private String tenKhuVuc;
	private int soLuongTrong;
	public DangKyThue() {
		super();
	}
	
	public DangKyThue(int maDangKyThue, String maSV, String maPhong, Timestamp thoiGian, String ho, String ten,
			String tenPhong, String maKhuVuc, String tenKhuVuc, int soLuongTrong) {
		super();
		this.maDangKyThue = maDangKyThue;
		this.maSV = maSV;
		this.maPhong = maPhong;
		this.thoiGian = thoiGian;
		this.ho = ho;
		this.ten = ten;
		this.tenPhong = tenPhong;
		this.maKhuVuc = maKhuVuc;
		this.tenKhuVuc = tenKhuVuc;
		this.soLuongTrong = soLuongTrong;
	}
	
	
	
	public DangKyThue(int maDangKyThue, String maSV, String maPhong, Timestamp thoiGian) {
		super();
		this.maDangKyThue = maDangKyThue;
		this.maSV = maSV;
		this.maPhong = maPhong;
		this.thoiGian = thoiGian;
	}

	
	public int getMaDangKyThue() {
		return maDangKyThue;
	}

	public void setMaDangKyThue(int maDangKyThue) {
		this.maDangKyThue = maDangKyThue;
	}

	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public Timestamp getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(Timestamp thoiGian) {
		this.thoiGian = thoiGian;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public String getMaKhuVuc() {
		return maKhuVuc;
	}
	public void setMaKhuVuc(String maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}
	public String getTenKhuVuc() {
		return tenKhuVuc;
	}
	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}
	public int getSoLuongTrong() {
		return soLuongTrong;
	}
	public void setSoLuongTrong(int soLuongTrong) {
		this.soLuongTrong = soLuongTrong;
	}
	
}
