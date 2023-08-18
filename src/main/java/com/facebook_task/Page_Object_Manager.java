package com.facebook_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	
	public WebDriver driver;

	private Pom_1 login;
	
	private Pom_2 forgetpage;


	public Pom_1 getInstanceLogin() {
		login=new Pom_1(driver);
		
		return login;
	}

	public Pom_2 getInstanceForgetpage() {
		forgetpage=new Pom_2(driver);
		
		return forgetpage;
	}
	
	
	public Page_Object_Manager(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(this.driver, this);
		
	}
	


}
