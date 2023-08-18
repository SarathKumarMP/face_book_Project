package com.facebook_task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	
	public Configuration_Reader() throws IOException {

		File f=new File("D:\\Sarath\\eclipse-workspace\\facebook_task\\Configuration_Prop\\Config.properties");
	
		
		FileInputStream fin=new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fin);
	}

	public String getUrl() {

		String url=p.getProperty("url");
		return url;
		
	}
	
	public String getEmail() {

		String email=p.getProperty("email");
		return email;
		
	}
	
	public String getPassword() {

		String password=p.getProperty("password");
		return password;
		
	}
	
	
}
