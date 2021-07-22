package com.univadis.practicePAGES;

import org.openqa.selenium.WebDriver;

import com.univadis.practicePAGES.NavBarComponents;

public class LandingPage extends NavBarComponents {

	public LandingPage(WebDriver wd) {
		super(wd); //NavBarComponent Constructor
		System.out.println(wd);		
	}

	
}
