package seleniumMavenJUnitTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TNG_0010 {
	private WebDriver chromeDriver;
	private String url;
	
	 @BeforeClass
	  public void openBrowser() {
		   System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
			
			url = "http://demo.guru99.com/test/newtours/";
			chromeDriver = new ChromeDriver();
			chromeDriver.manage().window().maximize();
			chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	 @Test(dataProvider = "Parameters", groups = "login")
  	 	public void test_method_0001(String userName, String password) {
		chromeDriver.get(url);
		chromeDriver.findElement(By.name("userName")).clear();
		chromeDriver.findElement(By.name("userName")).sendKeys("a");
		chromeDriver.findElement(By.name("password")).clear();
		chromeDriver.findElement(By.name("password")).sendKeys("a");
		chromeDriver.findElement(By.name("submit")).click();
		logout();
	 }
	private void logout() {
		// TODO Auto-generated method stub
		chromeDriver.findElement(By.linkText("SIGN-OFF")).sendKeys("a");
	}
	
	 
	@DataProvider
		public Object[][] Parameters() {
		return new Object[][] {
			new Object[] { 1, "a" },
			new Object[] { 2, "b" },
    };
	}
 

	@AfterClass
		public void afterClass() {
//		chromeDriver.quit(); 
		}

}
