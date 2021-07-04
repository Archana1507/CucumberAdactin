package org.stepdefinition;
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

public class SearchHotel  extends BaseClass{
	public WebDriver driver;
	public LoginPojo lp;

	@Given("User is in  Login Page")
	public void user_is_in_Login_Page() {
		launchBrowser();
		Urllaunch("https://adactinhotelapp.com/");}


	@Given("User enter {string} ,{string}")
	public void user_enter(String username, String password) {
		lp=new LoginPojo();
		fillTextBox(lp.getTxtUsername(),username);
		fillTextBox(lp.getTxtPassword(),password);}
	
	@When("User click Login")
	public void user_click_Login() throws InterruptedException {
		LoginPojo l1=new LoginPojo();
		btnclick(l1.getBtnlogin());
		Thread.sleep(1000);}
	

	@When("User is in search page, User enter details for hotel search")
	public void user_is_in_search_page_User_enter_details_for_hotel_search() throws InterruptedException {
		LoginPojo l2=new LoginPojo();
		selectByVisibleText(l2.getLocation(),"Sydney");
		selectByVisibleText(l2.getHotels(),"Hotel Sunshine");
		selectByVisibleText(l2.getRoomType(),"Double");
		Thread.sleep(1000);}


 @When("User click search button,User click Radio button and click continue")
	public void user_click_search_button_User_click_Radio_button_and_click_continue() throws InterruptedException {
		LoginPojo l2=new LoginPojo();
		btnclick(l2.getSubmit());
		btnclick(l2.getSelect());
		btnclick(l2.getCont());
		Thread.sleep(1000);
	}



	@Then("User book the hotel by filling {string} ,{string},{string}")
	public void user_book_the_hotel_by_filling(String firstname, String lastname, String address) {

		LoginPojo l3=new LoginPojo();
		fillTextBox(l3.getFirstname(),firstname);
		fillTextBox(l3.getLastname(),lastname);
		fillTextBox(l3.getAddress(),address);
	}


	@Then("User pay amount using {string} ,{string},{string},{string},{string}")
	public void user_pay_amount_using(String cc_num, String cvv, String ccType, String month, String year) throws InterruptedException {
		LoginPojo l4=new LoginPojo();
		fillTextBox(l4.getCc_num(),cc_num);
		fillTextBox(l4.getCc_cvv(),cvv);
		fillTextBox(l4.getCc_Type(),ccType);
		fillTextBox(l4.getMonth(),month);
		fillTextBox(l4.getYear(),year);
		Thread.sleep(1000);

	}

 @Then("User click booknow button and id number is generated")
	public void user_click_booknow_button_and_id_number_is_generated() throws InterruptedException {
		LoginPojo l5=new LoginPojo();
		btnclick(l5.getBooknow());
		Thread.sleep(6000);
		System.out.println("order no=" +getAttribute(l5.getOrder_no()));}}












