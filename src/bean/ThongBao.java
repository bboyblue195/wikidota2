package bean;

import java.sql.Timestamp;

public class ThongBao {
	private String maThongBao;
	private String tieude;
	private String noidung;
	private Timestamp thoigian;

	public ThongBao() {
		super();
	}
	
	public ThongBao(String maThongBao, String tieude, String noidung, Timestamp thoigian) {
		super();
		this.maThongBao = maThongBao;
		this.tieude = tieude;
		this.noidung = noidung;
		this.thoigian = thoigian;
	}

	public String getMaThongBao() {
		return maThongBao;
	}
	public void setMaThongBao(String maThongBao) {
		this.maThongBao = maThongBao;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public Timestamp getThoigian() {
		return thoigian;
	}
	public void setThoigian(Timestamp thoigian) {
		this.thoigian = thoigian;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	
	
}
