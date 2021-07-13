package com.seleniumEsentials.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BrokenLinkFinder {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("http://139.59.91.96:5001/selenium-workbook/");
		wd.manage().window().maximize();
		
		List<WebElement> allLinks = wd.findElements(By.xpath("//a[@href]"));
		
		int count =0;
		for(WebElement link: allLinks) {
			String url = link.getAttribute("href");
			RestAssured.baseURI =url;
			RequestSpecification request = RestAssured.given();
			Response response = request.get();
			
			if (response.getStatusCode() == 200) {
				System.out.println(url+" This is a valid LInk");
			}
			else {
				System.out.println(url+" This is a Invalid Link");
				count++;
			}
		}
		System.out.println("Total Invalid links = "+count);
		

	}

}
