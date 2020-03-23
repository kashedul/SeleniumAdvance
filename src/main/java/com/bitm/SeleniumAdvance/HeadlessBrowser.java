package com.bitm.SeleniumAdvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class HeadlessBrowser {

	public static void main(String[] args) {
		
		// Creating a new instance of the HTML unit driver
		WebDriver dr = new HtmlUnitDriver();
		
		// Navigate to webApplication
		dr.get("http://www.newtours.demoaut.com/");
		
		// This code will print the page title	
		System.out.println("Page Title is " + dr.getTitle());

	}

}
