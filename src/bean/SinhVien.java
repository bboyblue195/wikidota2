package bean;

import java.sql.Timestamp;

public class SinhVien {
	private String maSV;
	private String ho;
	private String ten;
	private String gioiTinh;
	private Timestamp ngaySinh;
	private String maLop;
	private String tenLop;
	private String sdt;
	private String diaChi;
	private String tenCha;
	private String tenMe;
	private String dtlhgd;
	private String maPhong;
	private String password;
	private String thoiGianDangKy;
	private String tenPhong;
	private String maKhuVuc;
	private String tenKhuVuc;
	private String maKhoa;
	private String tenKhoa;
	public SinhVien() {
		super();
	}
	public SinhVien(String maSV, String ho, String ten, String gioiTinh, Timestamp ngaySinh, String maLop,String tenLop, String sdt,
			String diaChi, String tenCha, String tenMe, String dtlhgd, String maPhong,String tenPhong,
			 String maKhuVuc, String tenKhuVuc,String thoiGianDangKy,String password,String maKhoa,String tenKhoa ) {
		super();
		this.maSV = maSV;
		this.ho = ho;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.tenCha = tenCha;
		this.tenMe = tenMe;
		this.dtlhgd = dtlhgd;
		this.maPhong = maPhong;
		this.thoiGianDangKy = thoiGianDangKy;
		this.tenPhong = tenPhong;
		this.maKhuVuc = maKhuVuc;
		this.tenKhuVuc = tenKhuVuc;
		this.password = password;
		this.maKhoa = maKhoa;
		this.tenKhoa = tenKhoa;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
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
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Timestamp getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Timestamp ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getTenCha() {
		return tenCha;
	}
	public void setTenCha(String tenCha) {
		this.tenCha = tenCha;
	}
	public String getTenMe() {
		return tenMe;
	}
	public void setTenMe(String tenMe) {
		this.tenMe = tenMe;
	}
	public String getDtlhgd() {
		return dtlhgd;
	}
	public void setDtlhgd(String dtlhgd) {
		this.dtlhgd = dtlhgd;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getThoiGianDangKy() {
		return thoiGianDangKy;
	}
	public void setThoiGianDangKy(String thoiGianDangKy) {
		this.thoiGianDangKy = thoiGianDangKy;
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
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String toString(){
		return "mssv : "+this.maSV;
	}
	public String getMaKhoa() {
		return maKhoa;
	}
	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}
	public String getTenKhoa() {
		return tenKhoa;
	}
	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}
	
}
