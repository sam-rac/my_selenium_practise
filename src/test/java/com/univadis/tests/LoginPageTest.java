package com.univadis.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.univadis.practicePAGES.HomePage;
import com.univadis.practicePAGES.LandingPage;
import com.univadis.practicePAGES.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	private WebDriver wd;
	private LoginPage loginpage;
	
	@BeforeMethod(description = "simple setup")
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 wd = new ChromeDriver();// new chrome session
		// System.out.println(wd);
		wd.get("https://www.univadis.co.uk/");
		LandingPage landingPage = new LandingPage(wd);
		loginpage = landingPage.goToLoginPage();		
	}

	@Test(description = "login verification", groups = {"e2e","sanity","smoke"},priority = 1)
	public void verifyLoginTest() {		
		HomePage home = loginpage.doLogin("jatinvsharma@gmail.com", "Qweqwe`1");		
		Assert.assertEquals(home.getUserName(), "Jatin Sharma");		
	}
	
	@AfterMethod(description = "Quit browser")
	public void tearDown() {
		wd.quit();
	}
}
