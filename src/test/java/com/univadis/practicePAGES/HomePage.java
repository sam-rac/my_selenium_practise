package com.univadis.practicePAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private static By USERNAME_SPAN = By.xpath("//span[@class='user-account__user-name']");
	private WebDriver wd;

	public HomePage(WebDriver wd) {
		super();
		this.wd = wd;
	}

	public String getUserName() {
		WebDriverWait wait = new WebDriverWait(wd, 30); // class variable
		WebElement userNamedSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_SPAN));
		String userName = userNamedSpan.getAttribute("data-fullname");
		return userName;
	}

}
