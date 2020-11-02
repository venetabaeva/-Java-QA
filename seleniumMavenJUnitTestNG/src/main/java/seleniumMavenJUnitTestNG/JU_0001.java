package seleniumMavenJUnitTestNG;

import org.junit.After;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JU_0001 {
	
		private static String baseUrl;
		private static WebDriver chromeDriver;
		
		@BeforeClass
		public static void initialization() {
			baseUrl = "http://demo.guru99.com/test/newtours/";
			System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
			chromeDriver = new ChromeDriver();	
		}
		
		@Before
		public  void before_method() {
			
		}

		@Test
		public void test_method_0001() {
			
			chromeDriver.get(baseUrl);
			chromeDriver.findElement(By.name("userName")).sendKeys("a");
			chromeDriver.findElement(By.name("password")).sendKeys("a");
			chromeDriver.findElement(By.name("submit")).click();
			
			String titleWelcomePage = "Welcome";
			String GetTitle = chromeDriver.getTitle();

			if(titleWelcomePage == GetTitle) {
				System.out.println("True: title");
				
			}
			else
				System.out.println("False: wrong page");
				chromeDriver.getPageSource();
		
	}
		
		
		@After
		public  void after_metthod() throws InterruptedException {
			
			Thread.sleep(2000);
			chromeDriver.close();
			
 
}
}
