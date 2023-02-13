package com.sauce.test;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sauce.base.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceE2ETest {
	
	private WebDriver driver;
	
	private LoginPage loginPage;
	
	Duration totalTime;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void firstTest() throws InterruptedException
	{
		
		Instant start = Instant.now();
		System.out.println(start);
		
		loginPage = new LoginPage(driver);
		
		loginPage.navigate().loginSauceDemo("standard_user", "secret_sauce")
		.clickShoppingCart()
		.doCheckout()
		.fillPersonalInfo("a", "s", "12345")
		.clickFinish()
		.checkOrderCompletion("THANK YOU FOR YOUR ORDER");
		
		Thread.sleep(2000);
		
		Instant end = Instant.now();
		System.out.println(end);
		totalTime = Duration.between(start, end);
		
		System.out.println("Test Run Completed in "+ totalTime  + " seconds");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
