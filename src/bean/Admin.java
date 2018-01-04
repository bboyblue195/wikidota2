package bean;

public class Admin {
	private String maAdmin;
	private String username;
	private String password;
	private String ho;
	private String ten;
	public Admin() {
		super();
	}
	public Admin(String maAdmin, String username, String password, String ho, String ten) {
		super();
		this.maAdmin = maAdmin;
		this.username = username;
		this.password = password;
		this.ho = ho;
		this.ten = ten;
	}
	public String getMaAdmin() {
		return maAdmin;
	}
	public void setMaAdmin(String maAdmin) {
		this.maAdmin = maAdmin;
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
	
}
