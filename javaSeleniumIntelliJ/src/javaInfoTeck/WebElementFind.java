package javaInfoTeck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementFind {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");

		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);
		driver.manage().window().maximize() ;
		Thread.sleep(1000);
		driver.findElement(By.name("userName"));
		System.out.println("User Name element found");
		driver.findElement(By.name("password"));
		System.out.println("Password element found");
		driver.findElement(By.name("submit"));
		System.out.println("Submit element found");
		Thread.sleep(1000);
		driver.close();
		
		
	}


		
	}


