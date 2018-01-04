package bean;

public class Comment {
	private int id_cmt;
	private String name_cmt;
	private String content_cmt;
	private int id_news;
	private String date_cmt;
	public Comment() {
		super();
	}
	
	public Comment(int id_cmt, String name_cmt, String content_cmt, int id_news, String date_cmt) {
		super();
		this.id_cmt = id_cmt;
		this.name_cmt = name_cmt;
		this.content_cmt = content_cmt;
		this.id_news = id_news;
		this.date_cmt = date_cmt;
	}

	public int getId_cmt() {
		return id_cmt;
	}
	public void setId_cmt(int id_cmt) {
		this.id_cmt = id_cmt;
	}
	public String getName_cmt() {
		return name_cmt;
	}
	public void setName_cmt(String name_cmt) {
		this.name_cmt = name_cmt;
	}
	public String getContent_cmt() {
		return content_cmt;
	}
	public void setContent_cmt(String content_cmt) {
		this.content_cmt = content_cmt;
	}
	public int getId_news() {
		return id_news;
	}
	public void setId_news(int id_news) {
		this.id_news = id_news;
	}
	public String getDate_cmt() {
		return date_cmt;
	}
	public void setDate_cmt(String date_cmt) {
		this.date_cmt = date_cmt;
	}
	
	
}
