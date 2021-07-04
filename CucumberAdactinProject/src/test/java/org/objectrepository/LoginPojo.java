package org.objectrepository;


import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPojo  extends BaseClass{

	public  LoginPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	public WebElement txtUsername;
	
	@FindBy(id="password")
	public WebElement txtPassword;
	
	@FindBy(id="login")
	public WebElement btnlogin;
	
	@FindBy(id="username_show")
	public WebElement txtusername_show;
	
	@FindBy(xpath="//a[contains(text(),'Search Hotel')]")
	public WebElement txtSearchHotel;
	
	@FindBy(id="location")
	public WebElement location;
	
	@FindBy(id="hotels")
	public WebElement hotels;
	
	@FindBy(id="room_type")
	public WebElement roomType;
	
	@FindBy(id="Submit")
	public WebElement Submit;
	
	@FindBy(id="radiobutton_0")
	public WebElement Select;
	
	@FindBy(id="continue")
	public WebElement cont;
	
	@FindBy(id="first_name")
	public WebElement firstname;
	
	@FindBy(id="last_name")
	public WebElement lastname;
	
	@FindBy(id="address")
	public WebElement address;
	

	@FindBy(id="cc_num")
	public WebElement cc_num;
	

	@FindBy(id="cc_cvv")
	public WebElement cc_cvv;
	
	@FindBy(id="cc_type")
	public WebElement cc_Type;
	
	@FindBy(id="cc_exp_month")
	public WebElement month;
	
	@FindBy(id="cc_exp_year")
	public WebElement year;
	
	@FindBy(id="book_now")
	public WebElement booknow;
	
	@FindBy(id="order_no")
	public WebElement orderno ;
	
	
	

	
	
	public WebElement getOrder_no() {
		return orderno;
	}

	public WebElement getCc_Type() {
		return cc_Type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getSelect() {
		return Select;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getTxtusername_show() {
		return txtusername_show;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtSearchHotel() {
		return txtSearchHotel;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	
	
	
	
	

}
