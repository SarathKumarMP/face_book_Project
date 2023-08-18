package com.facebook_task;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;


public class Base_class {
	
	public static WebDriver driver;
	
	
	public static void sendKeyelement(WebElement element1, String passkey) {
		element1.sendKeys(passkey);

	}
	
	public static void clickonElement(WebElement element2) {
		element2.click();

	}
	
	public static void dropdownvalue(WebElement element3, String methodtype, String Value){
		Select s=new Select(element3);
		
		if(methodtype.equalsIgnoreCase("value")) {
			s.selectByValue(Value);
		}
		else if(methodtype.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(Value);
		}
		else if(methodtype.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(Value);
			
			s.selectByIndex(parseInt);
		}
		
		
	}

	public static void Screenshottaken(String tsname) throws IOException {
	  
	  TakesScreenshot ts= (TakesScreenshot) driver; 
	  File source =ts.getScreenshotAs(OutputType.FILE); 
	  File des=new File("D:\\Sarath\\eclipse-workspace\\facebook_task\\Screenshot\\"+tsname+".png"); 
	  FileUtils.copyFile(source, des); 
	  
	  }
	 
	
	
	
	

}
