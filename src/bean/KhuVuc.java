package bean;

public class KhuVuc {
	private String maKhuVuc;
	private String tenKhuVuc;
	public KhuVuc() {
		super();
	}
	public KhuVuc(String maKhuVuc, String tenKhuVuc) {
		super();
		this.maKhuVuc = maKhuVuc;
		this.tenKhuVuc = tenKhuVuc;
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
