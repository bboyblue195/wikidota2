package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
public class PropertiesLib extends HttpServlet{
	public static Properties loadProperties(HttpServletRequest request, String propertiesname){
		String pathname = request.getServletContext().getRealPath("WEB-INF/classes/"+propertiesname);
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
