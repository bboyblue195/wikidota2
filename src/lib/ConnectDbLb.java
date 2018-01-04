package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectDbLb {
	private static Connection conn;
	private static String db;
	private static String url;
	private static String user;
	private static String password;
	

	public ConnectDbLb() {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		this.db = rb.getString("database");
		this.url ="jdbc:mysql://localhost:3306/"+db+"?useUnicode=true&characterEncoding=UTF-8";
		this.user =rb.getString("username");
		this.password=rb.getString("password");
	}
	
	//mo ket noi
	public Connection getConnectMySQL(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public void closeConnect(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
