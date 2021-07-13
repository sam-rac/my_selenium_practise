package com.seleniumEsentials.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("http://139.59.91.96:5001/selenium-workbook/people-table.html");
		wd.manage().window().maximize();
		
		List<WebElement> ageList = wd.findElements(By.xpath("//tbody/tr/td[4]"));
		
		List<Integer> agearray = new ArrayList<Integer>();
		Integer totalage =0;
		for (int i =0 ; i< ageList.size();i++) {
			System.out.println(ageList.get(i).getText());
			totalage += Integer.parseInt(ageList.get(i).getText());
			agearray.add(Integer.parseInt(ageList.get(i).getText()));
			
		}
		System.out.println(Collections.max(agearray));
		
		List<WebElement> firstNameList = wd.findElements(By.xpath("//tbody/tr/td[2]"));
		List<WebElement> lastNameList = wd.findElements(By.xpath("//tbody/tr/td[3]"));
		
		for(int i=0 ;i< ageList.size();i++) {
			int ag = Integer.parseInt(ageList.get(i).getText()) ;
		
			if(ag== Collections.max(agearray)) {
				System.out.println("The persons with max age are "+firstNameList.get(i).getText()+"_"+lastNameList.get(i).getText());
			}
		}
	}

}
