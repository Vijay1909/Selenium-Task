package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import graphql.Assert;

public class Task {

		public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Testing Vijay\\Tata\\Driver\\chromedriver.exe");
		     WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.manage().window().maximize();
			driver.navigate().to("https://realpython.com/");
			driver.findElement(By.id("navbarDropdownLibrary")).click();
			Thread.sleep(3000);
			Actions a = new Actions(driver);		
			WebElement Topics = driver.findElement(By.xpath("//a[text()=' Browse Topics →']"));
//			WebElement Topics = driver.findElement(By.xpath("//a[text()=' Quizzes →']"));
			a.moveToElement(Topics).perform();
			a.click(Topics).perform();
			List<WebElement> listoftopics = driver.findElements(By.tagName("h2"));		
		for (int i = 0; i < listoftopics.size(); i++) {
			String text = listoftopics.get(i).getText();
			System.out.println(text);
			Thread.sleep(3000);
			driver.quit();
			}}}
				
			


