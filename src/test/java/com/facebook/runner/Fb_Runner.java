package com.facebook.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.aventstack.extentreports.*;
import com.facebook_task.Base_class;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\facebook\\feature\\fb.feature",
glue="com.facebook.stepdef", 
plugin = {"pretty", 
		"html:Report/Cucumber_Html_Report", 
		"json:Report/Cucumber_Json_Report.json" 
		//"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_Report.html"
		//"com.aventstack.extentreports.cucumber.listener.ExtentCucumberAdapter:Report/Cucumber_Extent_Report.html"
		//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_Report.html"
}, monochrome = true, tags = "@smoketest1"
//dryRun = true
//strict = true
)


public class Fb_Runner{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browser_launch() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Sarath\\eclipse-workspace\\IPT_Selnium\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public static void browser_close() {
	
		//driver.close();
	}
	
	

}
