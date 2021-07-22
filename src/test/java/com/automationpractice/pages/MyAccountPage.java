package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage {
	private static final By MYADDRESS_BUTTON_LOCATOR = By.linkText("My address");
	private static final By ADDNEWADDRESS_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Add a new address')]");
	private WebDriver wd;
	
	public void addNewAddress() {
		WebDriverWait wdwait = new WebDriverWait(wd,10);
		wdwait.until(ExpectedConditions.elementToBeClickable(MYADDRESS_BUTTON_LOCATOR)).click();
		
		if(wd.getTitle() == "Addresses - My Store") {
			
		wdwait.until(ExpectedConditions.elementToBeClickable(ADDNEWADDRESS_BUTTON_LOCATOR)).click();
		
		}
	}

}
