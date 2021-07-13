package com.seleniumEsentials.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("http://139.59.91.96:5001/selenium-workbook/registration-form.html");
		wd.manage().window().maximize();
		
		wd.findElement(By.xpath("//label[contains(text(),'Email')]/../../div[2]/input[@type='email']")).sendKeys("sameer@abc.com");
		wd.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd123");
		
		//DropDown
		Select hearAboutDD =new Select( wd.findElement(By.xpath("//select[@name='hearAbout']")));
		hearAboutDD.selectByIndex(1);
		Thread.sleep(3000);
		hearAboutDD.selectByVisibleText("Advert");
		
		wd.findElement(By.xpath("//input[@value='phone']")).click();//Radio Button
		
		Select intrestDD =new Select( wd.findElement(By.name("interest")));
		intrestDD.selectByIndex(2);
		
		wd.findElement(By.name("terms")).click();
		
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//button[text()='Sign-up']")).click();;
		
		
		

	}

}
