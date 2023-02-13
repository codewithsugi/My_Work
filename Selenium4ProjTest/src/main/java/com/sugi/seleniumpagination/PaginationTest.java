package com.sugi.seleniumpagination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTest {
	
	
	

	@Test
	void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://datatables.net/");
		
		List<String> name = new ArrayList();

		
		int pages = driver.findElements(By.cssSelector("#example_paginate>span>a")).size();
		
		Thread.sleep(5);
		
		for(int i=1;i<=pages;i++)
		{
			driver.findElement(By.cssSelector("#example_paginate>span>a:nth-child("+i+")")).click();
			
			int tableSize = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
			
			System.out.println(tableSize);
		
			
			  for(int j=1;j<=tableSize;j++) { 
				  	name.add(driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]")).getText());
				  
			  }
			  
			  System.out.println(name);
			
		}
		
		driver.quit();

	}
	
}
