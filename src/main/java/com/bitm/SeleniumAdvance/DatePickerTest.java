package com.bitm.SeleniumAdvance;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DatePickerTest {

	public static void main(String[] args) {
	
		
		
System.setProperty("webdriver.gecko.driver", "F:\\Kashedul\\Selenium Files\\Gecko\\geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
		dr.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		
		dr.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		dr.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
		
		
		// Date Picker Open	
		dr.findElement(By.xpath("//*[@id=\"calFromDate\"]")).click();
		
		
		// Select Month
		
		dr.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		
		Select month = new Select(dr.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		
		month.selectByVisibleText("Aug");
		
		//Select Year
		dr.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
		
		Select year = new Select(dr.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		
		year.selectByVisibleText("2023");
		
		//Select Date
		
		WebElement dateWidget = dr.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

		for (WebElement cell: columns){
		   //Select 13th Date 
		   if (cell.getText().equals("13")){
		      cell.findElement(By.linkText("13")).click();
		      break;
		 }
		
		 
	}
}
	
}
