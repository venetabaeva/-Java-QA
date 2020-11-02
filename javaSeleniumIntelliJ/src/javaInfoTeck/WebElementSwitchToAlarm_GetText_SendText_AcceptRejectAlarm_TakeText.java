package javaInfoTeck;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSwitchToAlarm_GetText_SendText_AcceptRejectAlarm_TakeText {

	static WebDriver driver;

	static Alert alert;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("alert")).click();
		alert = driver.switchTo().alert();
		System.out.println("Alert 1: " + alert.getText());
		Thread.sleep(3000);
		alert.accept();
		System.out.println("Alert Output: " + driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		driver.findElement(By.id("confirm")).click();
		alert = driver.switchTo().alert();
		System.out.println("Alert 2: " + alert.getText());
		Thread.sleep(3000);
		alert.accept();
		System.out.println("Alert Output: " + driver.findElement(By.xpath("//p[@id='demo']")).getText());


		driver.findElement(By.id("prompt")).click();
		alert = driver.switchTo().alert();
		System.out.println("Alert 3: " + alert.getText());
		alert.sendKeys("Veneta Baeva");
		Thread.sleep(3000);
		alert.accept();
		System.out.println("Alert Output: " + driver.findElement(By.xpath("//p[@id='demo']")).getText());

		driver.close();
		
		

	}

}
