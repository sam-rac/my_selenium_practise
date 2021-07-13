package com.seleniumEsentials.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("http://139.59.91.96:5001/selenium-workbook/wyswyg-editor.html");
		wd.manage().window().maximize();
		
		System.out.println(wd.findElement(By.tagName("h1")).getText());
		
		//switchTO --- 
		
		//wd.switchTo().frame("editor_ifr");
		By frameLocator = By.xpath("//iframe"); 
		WebElement frameElement = wd.findElement(frameLocator);
		wd.switchTo().frame(frameElement);
		
		
		By bodyIdLocator = By.id("tinymce"); 
		WebElement editorBody = wd.findElement(bodyIdLocator);
		editorBody.clear();
		editorBody.sendKeys(Keys.CONTROL+"i");
		editorBody.sendKeys("2435");
		//wd.findElement(By.id("tinymce")).clear(); //cLEAR EVERYTHING
		//wd.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL+"i"); //"Italic" Font
		//wd.findElement(By.id("tinymce")).sendKeys("2435");
		
		wd.switchTo().defaultContent();
		System.out.println(wd.findElement(By.tagName("h1")).getText());
	}

}
