package com.facebook_task;

import java.io.IOException;

public class File_Reader {

	private File_Reader() {
		// we cant create the object outside the class because of the constructor to be private.
	}
	
	public static File_Reader getInstanceFR() {
		
		File_Reader FR=new File_Reader();
		return FR;

	}
	
	public Configuration_Reader getInstanceCR() throws IOException {
		
		Configuration_Reader CR=new Configuration_Reader();
		return CR;
		
	} 
	
	
	
}
