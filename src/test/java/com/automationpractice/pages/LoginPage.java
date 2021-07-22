package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private static final By EMAIL_TEXTBOX_LOCATOR = By.id("email");
	private static final By PSWD_TEXTBOX_LOCATOR = By.id("passwd");
	private static final By SIGNIN_BUTTON_LOCATOR = By.id("SubmitLogin");
	private static final By CREATE_EMAIL_BOX_LOCATOR = By.id("email_create"); 
	private static final By CREATE_EMAIL_BUTTON_LOCATOR = By.xpath("//button[@id='SubmitCreate']");
	private WebDriver wd;	

	
	public HomePage doLogin(String username, String pswd) {
		WebDriverWait wdwait = new WebDriverWait(wd, 10);
		wdwait.until(ExpectedConditions.visibilityOfElementLocated(EMAIL_TEXTBOX_LOCATOR)).sendKeys("username");
		wdwait.until(ExpectedConditions.visibilityOfElementLocated(PSWD_TEXTBOX_LOCATOR)).sendKeys("pswd");
		wdwait.until(ExpectedConditions.elementToBeClickable(SIGNIN_BUTTON_LOCATOR)).click();
		HomePage h = new HomePage(wd);
		return h;
	}
	
	public void createAccount() {
		WebDriverWait wdwait = new WebDriverWait(wd, 20);
		wdwait.until(ExpectedConditions.visibilityOfElementLocated(CREATE_EMAIL_BOX_LOCATOR)).sendKeys("raichur.samir@gmail.com");
		wdwait.until(ExpectedConditions.elementToBeClickable(CREATE_EMAIL_BUTTON_LOCATOR)).click();
		
	}

}
