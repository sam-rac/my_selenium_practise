package com.univadis.practicePAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.univadis.co.uk/");
		
		LandingPage landingPage = new LandingPage(wd);
		landingPage.goToLoginPage();
	}

}
