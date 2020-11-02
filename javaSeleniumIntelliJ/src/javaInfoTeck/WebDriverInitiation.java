package javaInfoTeck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;

public class WebDriverInitiation {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/venetabaeva/Documents/QA/drivers/geckodriver");
		

		driver = new ChromeDriver();
		driver.get("https://edition.cnn.com/");
		System.out.println("Chrome Browser opened");
		
		
		driver = new FirefoxDriver();
		driver.get("https://edition.cnn.com/");
		System.out.println("Mozilla Browser opened");

		
		
		driver = new SafariDriver();
		driver.get("https://edition.cnn.com/");
		System.out.println("Safari Browser opened");

		

	}

}
