package com.univadis.practicePAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();// new chrome session
		// System.out.println(wd);
		wd.get("https://www.univadis.co.uk/");

		LandingPage landingPage = new LandingPage(wd);
		landingPage.goToLoginPage();

		LoginPage loginPage = new LoginPage(wd);
		// loginPage.doLogin("jatinvsharma@gmail.com", "Qweqwe`1");
		loginPage.goToForgotPasswordPage();

		ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(wd);
		forgotPasswordPage.forgotPassword("jatinvsharma@gmail.com");

	}

}
