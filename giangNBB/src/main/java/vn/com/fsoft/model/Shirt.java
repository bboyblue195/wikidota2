package vn.com.fsoft.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SHIRTS")
public class Shirt {
		@Id
		private String ID;
		
		@Column(name="CatID")
		private String catid;	

		@Column(name="Name")
		private String name;
		
		@Column(name="Gender")
		private String gender;
		
		@Column(name="Material")
		private String material;
		
		@Column(name="Date")
		private String date;
		
		@Column(name="Price")
		private String price;
		
		public Shirt() {
			super();
		}

		public Shirt(String iD, String catid, String name, String gender, String material, String date, String price,
				String sizes, String colors, String imagefile, String sold) {
			super();
			ID = iD;
			this.catid = catid;
			this.name = name;
			this.gender = gender;
			this.material = material;
			this.date = date;
			this.price = price;
			this.sizes = sizes;
			this.colors = colors;
			this.imagefile = imagefile;
			this.sold = sold;
		}

		@Column(name="Sizes")
		private String sizes;
		
		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}

		public String getCatid() {
			return catid;
		}

		public void setCatid(String catid) {
			this.catid = catid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getSizes() {
			return sizes;
		}

		public void setSizes(String sizes) {
			this.sizes = sizes;
		}

		public String getColors() {
			return colors;
		}

		public void setColors(String colors) {
			this.colors = colors;
		}

		public String getImagefile() {
			return imagefile;
		}

		public void setImagefile(String imagefile) {
			this.imagefile = imagefile;
		}

		public String getSold() {
			return sold;
		}

		public void setSold(String sold) {
			this.sold = sold;
		}

		@Column(name="Colors")
		private String colors;
		
		@Column(name="ImageFile")
		private String imagefile;
		
		@Column(name="Sold")
		private String sold;
}
