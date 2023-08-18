package com.facebook.stepdef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.facebook.runner.Fb_Runner;
import com.facebook_task.Base_class;
import com.facebook_task.File_Reader;
import com.facebook_task.Page_Object_Manager;
import com.facebook_task.Pom_1;
import com.facebook_task.Pom_2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_StepDef extends Base_class {
	
	public WebDriver driver = Fb_Runner.driver;
	
	Page_Object_Manager pom_main=new Page_Object_Manager(driver);
	//Pom_1 pom1=new Pom_1(driver);
	//Pom_2 pom2=new Pom_2(driver);
	
@Given("launch the Insta Application URL")
	public void launch_the_insta_application_url() throws IOException {

	//driver.get("https://in.linkedin.com/");
	
	String urllink = File_Reader.getInstanceFR().getInstanceCR().getUrl();
	
	driver.get(urllink);
	driver.manage().window().maximize();
	
	}

@When("user Enter the User name in the InputField")
	public void user_enter_the_user_name_in_the_input_field() throws InterruptedException, IOException {
	
	//WebElement email = driver.findElement(By.id("session_key"));
	
	//WebElement email = pom1.getEmail();
	
	WebElement email = pom_main.getInstanceLogin().getEmail();
	
	Thread.sleep(2000);
	
	 String email2 = File_Reader.getInstanceFR().getInstanceCR().getEmail();
	
	 sendKeyelement(email, email2);
	 
	//sendKeyelement(email, "sarath0495@gmail.com");

}

@When("user Enter the Password in the InputField")
	public void user_enter_the_password_in_the_input_field() throws IOException {
	//WebElement password = driver.findElement(By.id("session_password"));
	
	//WebElement password = pom1.getPass();
	
	WebElement password = pom_main.getInstanceLogin().getPass();
	
	String password2 = File_Reader.getInstanceFR().getInstanceCR().getPassword();
	
	sendKeyelement(password, password2);
	
	//sendKeyelement(password, "12364859");
	
}

@Then("user Clicks on the Login button and Navigate to User HomePage")
	public void user_clicks_on_the_login_button_and_navigate_to_user_home_page() throws IOException, InterruptedException {
	
	//WebElement login = driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']"));
    //WebElement login = pom1.getLogin();
	WebElement login = pom_main.getInstanceLogin().getLogin();
	
	clickonElement(login);
	
	Thread.sleep(2000);
	//ts();
	
	}

@Then("user Click Forgotten Password Navigate to Forgot Password Page")
	public void user_click_forgotten_password_navigate_to_forgot_password_page() {
	
	//WebElement forgotpass = pom2.getForgot_pass();
	
	//WebElement forgetpass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	
	WebElement forgotpass = pom_main.getInstanceForgetpage().getForgot_pass();
	
	forgotpass.click();
	
	WebElement username = pom_main.getInstanceForgetpage().getUsername();
	
	//WebElement username = pom2.getUsername();
	sendKeyelement(username, "sarathkumar");
	
	
	
	//WebElement reset_pass = pom2.getReset_pass();

	
}

@Given("user click Create account button")
public void user_click_create_account_button() {

}
@When("user Enter the Firstname in the InputField")
public void user_enter_the_firstname_in_the_input_field() {

}
@When("user Enter the Surname in the InputField")
public void user_enter_the_surname_in_the_input_field() {

}
@When("user Enter the Mobile or EmailNum in the Field")
public void user_enter_the_mobile_or_email_num_in_the_field() {

}
@When("user Enter Own Password in the Filed")
public void user_enter_own_password_in_the_filed() {

}
@When("user Click on date birth in this dropdown field")
public void user_click_on_date_birth_in_this_dropdown_field() {

}


@When("user Select the gender in the field") 
public void user_select_the_gender_in_the_field() {
  
}
  
@Then("user Click signup button and navigate the User Homepage") 
public void user_click_signup_button_and_navigate_the_user_homepage() {
  
  }
 


}
