package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLoginpage {
	public WebDriver driver;
	
	@Given("User is in Adactin Login Page")
	public void user_is_in_Adactin_Login_Page() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://adactinhotelapp.com/");
	}

	@When("User enter  invalid Username and Password")
	public void user_enter_invalid_Username_and_Password() {
	  WebElement txtusername= driver.findElement(By.id("username"));
	  txtusername.sendKeys("Lalitha");
	  
	  WebElement txtpassword= driver.findElement(By.id("password"));
	  txtpassword.sendKeys("12345");
	  
	}

	@When("User click Login button")
	public void user_click_Login_button() throws InterruptedException {
	
	WebElement btnlogin= driver.findElement(By.id("login"));
	btnlogin.click();
	Thread.sleep(1000);}

	@Then("User should displayed with error message.")
	public void user_should_displayed_with_error_message() {
	   String url=driver.getCurrentUrl();
	   Assert.assertTrue("Check the url",url.contains("adactinhotelapp"));
	}}

	
	
