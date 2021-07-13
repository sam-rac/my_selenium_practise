package com.seleniumEsentials.practise;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("http://139.59.91.96:5001/selenium-workbook/datepicker.html");
		wd.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(wd, 40);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker"))).click();
		
		WebElement calenderTable =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-calendar")));
		
		Date stdDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		String customeDateFormat = dateFormat.format(stdDate);
		By date = By.linkText(customeDateFormat);
		calenderTable.findElement(date).click();
				
	}

}
