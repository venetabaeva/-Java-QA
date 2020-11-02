package javaInfoTeck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFindSendKeysClick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");

		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);
		driver.manage().window().maximize() ;
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys("veneta");
		Thread.sleep(1000);
		System.out.println("userName entered ");
		driver.findElement(By.name("password")).sendKeys("pass123");
		Thread.sleep(1000);
		System.out.println("password entered ");
		driver.findElement(By.name("submit")).click();
		System.out.println("submit clicked ");
		driver.findElement(By.xpath("//span[contains(text(),'Enter your userName and password correct')]"));
		Thread.sleep(1000);
		System.out.println("Error:Enter your userName and password correct");
		
		
		driver.close();
	}

}
