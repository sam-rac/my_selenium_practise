package com.automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.pages.LandingPage;

public class LoginTest {
    private LoginPage loginPage;
    private HomePage home;
    private WebDriver wd;
    
	
	public LoginTest(LoginPage loginPage, HomePage home, WebDriver wd) {
		super();
		this.loginPage = loginPage;
		this.home = home;
		this.wd = wd;
	}

	@BeforeMethod(description = "initial setup")
	public void pageSetup() {
		//WebDriverManager.chromedriver().setup();
		//wd.get("http://automationpractice.com/index.php");
		//home = new HomePage(wd);
		//home.openHomePage("http://automationpractice.com/index.php");
		LandingPage landingPage = new LandingPage(wd);
		//loginPage = landingPage.goToLoginPage();
		if(landingPage.gotoLoginPage() == "Login - My Store") {
			System.out.println("Landed in LOGIN PAGE");
		}
	}
    
	@Test(description = "validate Login",groups = {"e2e","smoke","sanity"},priority = 1)
	public void verifyLogin() {
		home = loginPage.doLogin("jatinvsharma@gmail.com","Qweqwe`1");
		Assert.assertEquals(home.getUserName(), "Jatin Sharma");
	}
	
	@AfterMethod(description = "close wwebdriver session")
	public void closeSession() {
		wd.quit();
	}
}
