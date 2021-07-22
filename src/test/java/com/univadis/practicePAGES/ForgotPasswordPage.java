package com.univadis.practicePAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordPage {

	private static final By EMAIL_ADDRESS_LOCATOR = By.name("email");
	private static final By CONTINUE_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Continue')]/..");
	private WebDriver wd;

	public ForgotPasswordPage(WebDriver wd) {
		super();
		this.wd = wd;
	}

	public void forgotPassword(String emailAddress) {
		WebDriverWait wait = new WebDriverWait(wd, 30); // class variable

		WebElement emailTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(EMAIL_ADDRESS_LOCATOR));
		emailTextBox.sendKeys(emailAddress);

		WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(CONTINUE_BUTTON_LOCATOR));
		continueButton.click();
	}
}
