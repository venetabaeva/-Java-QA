package javaInfoTeck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	static WebDriver driver;
	static WebElement source;
	static WebElement target;
	static Actions act;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
        source = driver.findElement(By.id("draggable"));
        target = driver.findElement(By.id("droppable"));
        
        act = new Actions(driver);
        act.dragAndDrop(source, target).build().perform();
        
        
	}

}
