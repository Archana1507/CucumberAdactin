package org.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();}

	public static void Urllaunch(String url) {
		driver.get(url);
	}

	public static void maximieWindow() {
		driver.manage().window().maximize();

	}

	public static void waitToAllLocators() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	public static void fillTextBox(WebElement e,String text) {
		e.sendKeys(text);

	}
	public static void btnclick(WebElement e) {
		e.click();

	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void urlAssertionForInvalidLogin() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue("Check the url",url.contains("adactinhotelapp"));

	}

	public static void validLogin(WebElement e) {
		Assert.assertTrue("Check the url",e.isDisplayed());

	}
	
	public  static void selectByVisibleText(WebElement e,String value) {
		Select s=new Select(e);
		s.selectByVisibleText(value);}

	public static void selectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.selectByValue(value);}


	public static void selectDropdownByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.selectByVisibleText(value);}

	public static void selectDropdownByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);}

	public static void deselectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue(value);}

	public static void deselectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);}


	public static void deselectByVisibleText(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByVisibleText(value);}

	public static String getAttribute(WebElement e) {
		
		 return e.getAttribute("value");
	}
	
	 public static void takeSnap(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;

		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ayyappan\\eclipse-workspace\\CucumberAdactinProject\\src\\test\\resources\\Reports\\Screenshots\\"+filename+ ".png");
		FileUtils.copyFile(src, des);}}
	
	








