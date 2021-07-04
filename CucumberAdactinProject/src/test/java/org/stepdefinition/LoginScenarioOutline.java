package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.objectrepository.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.datatable.DataTable;

public class LoginScenarioOutline extends BaseClass {
	public LoginPojo l;

	public WebDriver driver;
	@Given("User is in Adactin login Page")
	public void user_is_in_Adactin_login_Page() {
		launchBrowser();
		Urllaunch("https://adactinhotelapp.com/");
	}

	@When("User enter invalid {string} ,{string}")
	public void user_enter_invalid(String Username, String Password) {
		l=new LoginPojo();
		fillTextBox(l.getTxtUsername(),Username);
		fillTextBox(l.getTxtPassword(),Password);

	}

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
		LoginPojo l=new LoginPojo();
		btnclick(l.getBtnlogin());
		Thread.sleep(2000);}





	@Then("User must validate the results based on {string}")
	public void user_must_validate_the_results_based_on(String type) {

		if(type.equals("positive")) {
			LoginPojo l1=new LoginPojo();
			validLogin(l1.getTxtusername_show());

		}

		else if(type.equals("negative")) {
			urlAssertionForInvalidLogin();}}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password( DataTable d) {
		List<String> list=d.asList();
		String username=list.get(0);
		String password=list.get(1);

		l=new LoginPojo();
		l.getTxtUsername();
	}

	@When("User click Login Button")
	public void user_click_Login_Button() throws InterruptedException {
		LoginPojo l=new LoginPojo();
		btnclick(l.getBtnlogin());
		Thread.sleep(2000);}


	@Then("User must displayed successful login")
	public void user_must_displayed_successful_login() {
		driver.navigate().to("https://adactinhotelapp.com/SearchHotel.php");
	}



}


