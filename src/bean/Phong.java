package bean;

public class Phong {
	private String maPhong;
	private String tenPhong;
	private String maKhuVuc;
	private String tenKhuVuc;
	private int mucGia;
	public Phong() {
		super();
	}
	public Phong(String maPhong, String tenPhong, String maKhuVuc, String tenKhuVuc, int mucGia) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.maKhuVuc = maKhuVuc;
		this.tenKhuVuc = tenKhuVuc;
		this.mucGia = mucGia;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
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
	public int getMucGia() {
		return mucGia;
	}
	public void setMucGia(int mucGia) {
		this.mucGia = mucGia;
	}
	
}
