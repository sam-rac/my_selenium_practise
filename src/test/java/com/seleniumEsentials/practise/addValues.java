/**
 * 
 */
package com.seleniumEsentials.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author user
 *
 */
public class addValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver wd = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("http://139.59.91.96:5001/selenium-workbook/shopping-cart.html");
		
		//String prodPrice= wd.findElement(By.xpath("//tbody/tr/td[2]")).getText();
		
		List<WebElement>  prodPriceList = wd.findElements(By.xpath("//tbody/tr/td[2]"));
		//prodPriceList.ite//
		//Iterator prodsPrices = prodPriceList.iterator();
		double total=0;
		//while(prodsPrices.hasNext()) {
		for(int i =0 ;i < prodPriceList.size();i++) {
			//WebElement element = prodPriceList.get(i);
			System.out.println(prodPriceList.get(i).getText().substring(1));
			total = total + Double.parseDouble(prodPriceList.get(i).getText().substring(1));
			
		//System.out.println(prodsPrices.next());
		}
		System.out.println(total);

	}

}
