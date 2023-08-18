package com.facebook_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_1 {

	public WebDriver driver;
	
	@FindBy(id="session_key")
	private WebElement email;

	@FindBy(id="session_password")
	private WebElement password;

	@FindBy(xpath="//button[@data-id='sign-in-form__submit-btn']")
	private WebElement login;
	
    public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public Pom_1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		
		
	}
	
}