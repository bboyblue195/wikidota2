package bean;

import java.sql.Timestamp;

public class NhanVien {
	private String maNV;
	private String ho;
	private String ten;
	private String gioiTinh;
	private Timestamp ngaySinh;
	private String maChucVu;
	private String sdt;
	private String diaChi;
	private String tenCha;
	private String tenMe;
	private String dtlhgd;
	private String username;
	private String password;
	private String tenChucVu;
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String ho, String ten, String gioiTinh, Timestamp ngaySinh, String maChucVu,String tenChucVu,
			String sdt, String diaChi, String tenCha, String tenMe, String dtlhgd, String username, String password) {
		super();
		this.maNV = maNV;
		this.ho = ho;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.tenCha = tenCha;
		this.tenMe = tenMe;
		this.dtlhgd = dtlhgd;
		this.username = username;
		this.password = password;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
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
	public String getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTenChucVu() {
		return tenChucVu;
	}
	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
}
