package com.univadis.practicePAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookieComponent {

	private static final By COOKIE_LOCATOR = By.id("onetrust-banner-sdk");
	private WebDriver wd;

	public CookieComponent(WebDriver wd) {
		super();
		this.wd = wd;
	}

	public void acceptCookie() {
		WebElement cookieElement = wd.findElement(COOKIE_LOCATOR);
		By IacceptTermsLocator = By.cssSelector("#onetrust-accept-btn-handler");
		WebElement acceptTermsElement = cookieElement.findElement(IacceptTermsLocator); // chaining Of Elements
		acceptTermsElement.click();
	}

}
