package com.univadis.practicePAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.univadis.practicePAGES.CookieComponent;
//import com.univadis.practicePAGES.LoginPage;

public class NavBarComponents {

	private static final By LOGIN_LINK_LOCATOR = By.xpath("//span[text()=\"Login\"]/..");
	private WebDriver wd; // NON STATIC VARIABLE
	private CookieComponent cookieComponent;
	
	public NavBarComponents(WebDriver wd) {
		super();// call the parent class constructor {Object}----java.lang.Object
		//System.out.println(wd);
		this.wd = wd; // this keyword is use to differentiate between local variable and classvariable
	}
	
	public LoginPage  goToLoginPage() {
		cookieComponent = new CookieComponent(wd);
		cookieComponent.acceptCookie();
		wd.manage().window().maximize();
		WebElement loginLinkElement = wd.findElement(LOGIN_LINK_LOCATOR);
		loginLinkElement.click();
	//	String s = "abc";
//		LoginPage loginPage = new LoginPage(wd);
//		return loginPage;
		return  new LoginPage(wd); 
	}
}
