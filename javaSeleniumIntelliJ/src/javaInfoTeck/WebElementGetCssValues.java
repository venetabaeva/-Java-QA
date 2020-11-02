package javaInfoTeck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetCssValues {
	
	static WebDriver driver;
	static WebElement css;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize(); 
		
		css = driver.findElement(By.xpath("//span[contains(text(),'mail')]"));
		System.out.println(css.getCssValue("font-family"));
		System.out.println(css.getCssValue("font-weight"));
		Thread.sleep(1000);
		
		driver.close();
	}

}
