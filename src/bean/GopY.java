package bean;

public class GopY {
	private int maGopY;
	private String ho_ten;
	private String email;
	private String noiDung;
	public GopY() {
		super();
	}
	public GopY(int maGopY, String ho_ten, String email, String noiDung) {
		super();
		this.maGopY = maGopY;
		this.ho_ten = ho_ten;
		this.email = email;
		this.noiDung = noiDung;
	}
	public int getMaGopY() {
		return maGopY;
	}
	public void setMaGopY(int maGopY) {
		this.maGopY = maGopY;
	}
	public String getHo_ten() {
		return ho_ten;
	}
	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	
	
}
