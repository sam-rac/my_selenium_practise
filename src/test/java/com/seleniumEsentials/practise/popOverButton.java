package com.seleniumEsentials.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popOverButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit Wait
		
		WebDriverWait wait = new WebDriverWait(wd, 30); //Explicit Wait
		
		wd.get("http://139.59.91.96:5001/selenium-workbook/tooltips.html");
		wd.manage().window().maximize();
		
		//Explicit wait : 1
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Popover"))).click();
		//wd.findElement(By.linkText("Popover")).click();
		
		WebDriverWait wait_popoverText = new WebDriverWait(wd, 60); //Customised Explicit wait
		System.out.println(wait_popoverText.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3"))).getText());
		
		//System.out.println(wd.findElement(By.tagName("h3")).getText()); //This is FLAKY !!!
		
		

	}

}
