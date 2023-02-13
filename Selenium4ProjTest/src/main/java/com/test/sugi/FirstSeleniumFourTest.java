package com.test.sugi;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumFourTest {
	
	
	
	
	
	@Test 
	void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com");
		
		driver.getTitle();
		
		By searchLocator = RelativeLocator.with(By.tagName("input"));
		
		driver.findElement(searchLocator).sendKeys("sugithanandan");
		
		//driver.findElement(RelativeLocator.with(By.tagName("input"))).sendKeys("test");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='Save Changes']")));
		
		

		
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		driver.quit();
		
		
		
		
	}
	

}
