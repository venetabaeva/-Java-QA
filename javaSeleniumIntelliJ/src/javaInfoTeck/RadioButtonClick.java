package javaInfoTeck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class RadioButtonClick {
	
	static WebDriver driver;
	static WebElement radioButtonOneWay;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();

		radioButtonOneWay = driver.findElement(By.xpath("//input[@value='oneway']"));
		radioButtonOneWay.click();
		Thread.sleep(2000);
		
		
		driver.close();
	}

}
