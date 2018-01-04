package bean;

import java.sql.Timestamp;

public class GiaHan {
	private String maSV;
	private String maPhong;
	private Timestamp thoiGianGH;
	private String tenPhong;
	private String maKhuVuc;
	private String tenKhuVuc;
	public GiaHan() {
		super();
	}
	public GiaHan(String maSV, String maPhong, Timestamp thoiGianGH, String tenPhong, String maKhuVuc,
			String tenKhuVuc) {
		super();
		this.maSV = maSV;
		this.maPhong = maPhong;
		this.thoiGianGH = thoiGianGH;
		this.tenPhong = tenPhong;
		this.maKhuVuc = maKhuVuc;
		this.tenKhuVuc = tenKhuVuc;
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
	public Timestamp getThoiGianGH() {
		return thoiGianGH;
	}
	public void setThoiGianGH(Timestamp thoiGianGH) {
		this.thoiGianGH = thoiGianGH;
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
	
}
