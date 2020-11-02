package javaInfoTeck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {
	
	static WebDriver driver;
	static Actions action;
	static WebDriverWait wait;
	static WebElement rightClickElement;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		action = new Actions(driver);	
		By locator = By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		rightClickElement = driver.findElement(locator);
		action.contextClick(rightClickElement).build().perform();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
