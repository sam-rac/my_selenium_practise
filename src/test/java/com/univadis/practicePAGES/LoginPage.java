package com.univadis.practicePAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.qameta.allure.Step;

public class LoginPage {

	// Step 1: find the locator
	private static final By USERNAME_TEXTBOX_LOCATOR = By.name("userId");
	private static final By PASSWORD_TEXTBOX_LOCATOR = By.name("password");
	private static final By LOGIN_BUTTON = By.xpath("//span[contains(text(),'Log In')]/../../button");
	private static final By FORGOT_PASSWORD_LINK = By.linkText("Forgot Password?");
	private static final By AUTOMATIC_LINK_LOCATOR = By.xpath("//p[@class='automaticLoginLink']/a");
	private static final By REGISTER_LINK_LOCATOR = By.xpath("//a[contains(text(),'Register')]");
	// Step 2: Create wd

	private WebDriver wd; // we will never make webdriver as static!!
	// if i make wd as static.... I am actually avoiding parallel testing!!

	// Step 3: Add parameterized constructor
	public LoginPage(WebDriver wd) {
		super();
		this.wd = wd;
	}

	// step 4:
	// functionalities on Login Page (Button and Links)
	// do login, go to register page, go send automatic link page and go to forgot
	// password page
	//@Step("Perform login to the application")
	public HomePage doLogin(String emailAddress, String password) {
		WebDriverWait wait = new WebDriverWait(wd, 30); // class variable

		WebElement userNameTextBox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_TEXTBOX_LOCATOR));
		userNameTextBox.sendKeys(emailAddress);
		WebElement passwordTextBox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_TEXTBOX_LOCATOR));
		passwordTextBox.sendKeys(password);
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON));
		loginButton.click();
		HomePage h = new HomePage(wd);
		return h;
	}

	public void goToForgotPasswordPage() {
		WebDriverWait wait = new WebDriverWait(wd, 30); // class variable
		WebElement forgotPassword = wait.until(ExpectedConditions.elementToBeClickable(FORGOT_PASSWORD_LINK));
		forgotPassword.click();
	}
}
