package com.sugi.seleniumpagination;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	@Test
	void test() throws InterruptedException, MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/ref=nav_logo");

		Thread.sleep(10);

		List<WebElement> links = new ArrayList();

		links.addAll(driver.findElements(By.xpath("//a")));

		for (WebElement elt : links) {
			System.out.println(elt.getAttribute("href"));
		}

		System.out.println(links);

		for (WebElement elt : links) {
			if (elt.getAttribute("href") != null && elt.getAttribute("href").startsWith("htt")) {

				System.out.println("current url under test -- > " + elt.getAttribute("href"));
				HttpURLConnection connection = (HttpURLConnection) new URL(elt.getAttribute("href")).openConnection();

				connection.connect();

				System.out.println(connection.getResponseMessage());

				connection.disconnect();

			}

		}

		driver.quit();

	}

}
