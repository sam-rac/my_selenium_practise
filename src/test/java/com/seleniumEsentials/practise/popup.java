package com.seleniumEsentials.practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("http://139.59.91.96:5001/selenium-workbook/popups.html");
		wd.manage().window().maximize();
		
		wd.findElement(By.linkText("Alert")).click();
		
		Alert alrt = wd.switchTo().alert();
		System.out.println(wd.switchTo().alert().getText());
		alrt.accept();	
		
		wd.switchTo().defaultContent();
		
		wd.findElement(By.linkText("Confirm")).click();
		System.out.println(wd.switchTo().alert().getText());
		//wd.switchTo().alert().accept();
		wd.switchTo().alert().dismiss();
		
		wd.switchTo().defaultContent();
	}

}
