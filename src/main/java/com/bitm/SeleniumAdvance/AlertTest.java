package com.bitm.SeleniumAdvance;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.gecko.driver", "F:\\Kashedul\\Selenium Files\\Gecko\\geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		
		dr.get("http://demo.guru99.com/test/delete_customer.php");
		
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("53920");
		
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		
		//Switch to Alert
		
				Alert al = dr.switchTo().alert();
				
				//Capture Alert Text
				
				String alertMasssage = al.getText();
				
				System.out.println(alertMasssage);
				
				//Dismiss Alert
				
				al.dismiss();
				
				
				//Accept Alert
				
				al.accept();
		
		
		
		
		
		
		
		
		
		//dr.findElement(By.name("Cusid")).sendKeys("53920");
		
		//dr.findElement(By.name("submit")).submit();
		
		
	}

}
