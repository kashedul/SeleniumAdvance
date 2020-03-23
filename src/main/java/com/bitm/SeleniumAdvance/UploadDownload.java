package com.bitm.SeleniumAdvance;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadDownload {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Kashedul\\Selenium Files\\Gecko\\geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		
		
		// Upload Test
		dr.get("http://demo.guru99.com/test/upload/");
		
		dr.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("F:\\Kashedul\\Selenium Files\\Chrome");
		
		dr.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		
		dr.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		System.out.println("File has been Uploaded Succesfully !!");
		
		
		// Download a File
		
		dr.get("http://demo.guru99.com/test/yahoo.html");
		
	    WebElement downloadButton = dr.findElement(By.xpath("//*[@id=\"messenger-download\"]"));
	    
	    String sourceLocation = downloadButton.getAttribute("href");
	    
	    String wgetCommand = "cmd /c F:\\Kasedul\\Wget\\wget.exe -P F:\\Kashedul\\Wget\\Download --no-check-certificate" +sourceLocation;
		 
		try {
			Process exec = Runtime.getRuntime().exec(wgetCommand);
			
			int exitvalue = exec.waitFor();
			
			System.out.println("Exit Value " + exitvalue);
			
			System.out.println("File has been Download Succesfully");
			
		} catch (InterruptedException ex) {
			
			System.out.println(ex.toString());
			
		}
	    
	    
		
	}

}
