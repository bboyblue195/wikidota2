package vn.com.fsoft.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
public class User {
	@Id
	private String ID;
	
	@Column(name="PASSWORD")
	private String Password;	

	@Column(name="Name")
	private String Name;
	
	@Column(name="Phone")
	private String Phone;
	
	@Column(name="Gender")
	private String Gender;
	
	@Column(name="DOB")
	private String Dob;

	@Column(name="Address")
	private String Address;

	@Column(name="RegDate")
	private String Regdate;

	@Column(name="Status")
	private String Status;

	@Column(name="FavoriteCat")
	private String Favoritecat;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getRegdate() {
		return Regdate;
	}

	public void setRegdate(String regdate) {
		Regdate = regdate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getFavoritecat() {
		return Favoritecat;
	}

	public void setFavoritecat(String favoritecat) {
		Favoritecat = favoritecat;
	}

	public User(String iD, String password, String name, String phone, String gender, String dob, String address,
			String regdate, String status, String favoritecat) {
		super();
		ID = iD;
		Password = password;
		Name = name;
		Phone = phone;
		Gender = gender;
		Dob = dob;
		Address = address;
		Regdate = regdate;
		Status = status;
		Favoritecat = favoritecat;
	}

	public User() {
		super();
	}
	}


	