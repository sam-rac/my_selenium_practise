package com.seleniumEsentials.practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForm {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		URL url = null;
		try {
			url = new URL("http://139.59.91.96:5001/selenium-workbook/login.html");
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		wd.navigate().to(url);
		//wd.get("http://139.59.91.96:5001/selenium-workbook/people-table.html");
		wd.manage().window().maximize();
		
		System.out.println(wd.findElement(By.tagName("h1")).getText().trim());
		
		System.out.println(wd.findElement(By.id("change-password")).getText());// Forgotten Password link
		
		wd.findElement(By.name("userid")).sendKeys(Keys.SHIFT+"sameer"); //email text box
		
		wd.findElement(By.name("password")).sendKeys("abcd"); //password text box
		
		//wd.findElement(By.name("password")).sendKeys("abcd"+Keys.TAB+Keys.RETURN); //password + login-button
		
		wd.findElement(By.xpath("//input[@value='Login']")).click();

	}

}
