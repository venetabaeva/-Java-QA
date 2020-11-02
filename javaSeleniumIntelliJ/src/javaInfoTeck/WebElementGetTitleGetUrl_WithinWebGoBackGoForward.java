package javaInfoTeck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetTitleGetUrl_WithinWebGoBackGoForward {
	
	static WebDriver driver;
	static String url;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");

		 driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);
		driver.manage().window().maximize() ;
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		url  = driver.getCurrentUrl(); 
		System.out.println(url);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.close();
	}

}
