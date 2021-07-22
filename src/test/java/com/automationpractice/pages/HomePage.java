package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	private static final By LOGIN_LOCATOR = By.linkText("Sign in");
	private static final By USER_NAME_LOCATOR = By.xpath("//*[@class='account']/span");
	
	private WebDriver driver;
	private WebDriverWait wait;
	
    public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
    
	
	
	public void openHomePage(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//return new HomePage(driver);
	}

    public String gotoLoginPage() {
    	wait = new WebDriverWait(driver, 20);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_LOCATOR)).click();  
    	return driver.getTitle();	
    	
    }

    public String getUserName() {
    	wait = new WebDriverWait(driver, 20);
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(USER_NAME_LOCATOR)).getText();
    }
}
