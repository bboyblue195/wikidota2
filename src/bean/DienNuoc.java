package bean;

import java.sql.Timestamp;

public class DienNuoc {
	private String maDienNuoc;
	private int soDien;
	private int soNuoc;
	private Timestamp thoiGian;
	private String maPhong;
	public DienNuoc() {
		super();
	}
	public DienNuoc(String maDienNuoc, int soDien, int soNuoc, Timestamp thoiGian, String maPhong) {
		super();
		this.maDienNuoc = maDienNuoc;
		this.soDien = soDien;
		this.soNuoc = soNuoc;
		this.thoiGian = thoiGian;
		this.maPhong = maPhong;
	}
	
	public DienNuoc(int soDien, int soNuoc) {
		super();
		this.soDien = soDien;
		this.soNuoc = soNuoc;
	}
	public String getMaDienNuoc() {
		return maDienNuoc;
	}
	public void setMaDienNuoc(String maDienNuoc) {
		this.maDienNuoc = maDienNuoc;
	}
	public int getSoDien() {
		return soDien;
	}
	public void setSoDien(int soDien) {
		this.soDien = soDien;
	}
	public int getSoNuoc() {
		return soNuoc;
	}
	public void setSoNuoc(int soNuoc) {
		this.soNuoc = soNuoc;
	}
	public Timestamp getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(Timestamp thoiGian) {
		this.thoiGian = thoiGian;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	@Override
	public String toString() {
		return "DienNuoc [maDienNuoc=" + maDienNuoc + ", soDien=" + soDien + ", soNuoc=" + soNuoc + ", thoiGian="
				+ thoiGian + ", maPhong=" + maPhong + "]";
	}
	
}
