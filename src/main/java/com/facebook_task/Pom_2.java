package com.facebook_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_2 {
	
	public WebDriver driver;

	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement forgot_pass;		
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="reset-password-submit-button")
	private WebElement reset_pass;

	public WebElement getForgot_pass() {
		return forgot_pass;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getReset_pass() {
		return reset_pass;
	}

	public Pom_2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);

	}


}
