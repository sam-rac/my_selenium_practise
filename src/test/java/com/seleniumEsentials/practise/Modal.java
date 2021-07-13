package com.seleniumEsentials.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Modal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("http://139.59.91.96:5001/selenium-workbook/popups.html");
		wd.manage().window().maximize();
		
		wd.findElement(By.linkText("Modal")).click();
		By modalLocator = By.className("modal-content");
		WebElement modalLocatorElement = wd.findElement(modalLocator);
		
		modalLocatorElement.findElement(By.tagName("input")).sendKeys("sameer"); //chaining of web elements
		modalLocatorElement.findElement(By.xpath("//button[text()='Cancel']")).click();
		
	    
	}

}
