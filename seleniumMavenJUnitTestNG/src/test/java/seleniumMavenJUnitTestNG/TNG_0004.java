package seleniumMavenJUnitTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG_0004 {
	
	@BeforeSuite
	public void suitebefore_I() {
		System.out.println("inside BeforeSuite");
	}
	
	@BeforeTest
	public void before_I() {
		System.out.println("inside BeforeTest");
	}
	
	@BeforeClass
	public void connect_I() {
		System.out.println("inside BeforeClass"); //once before test method
	}
	
	@BeforeMethod
	  public void initialize_I(){
		  System.out.println("inside BeforeMethod");
			
		}
		
	  @Test
	  public void test_method_I_0001login() {
		  System.out.println("inside Login");
	  }
	  
	  @Test
	  public void test_method_I_0002login() {
		  System.out.println("inside Logout");
	  }
	  
	  @AfterMethod
		public void close_nizialized_I(){
		  System.out.println("inside AfterMethod");
		}
	  @AfterClass
		public void terminate_connect_I() {
			System.out.println("inside AfterClass"); //once after all test method within the class are executed

		}
	  
	  @AfterTest
		public void after_I() { // once teh execution of all the tests are completed 
		  System.out.println("inside AfterTest");
		}
	  
	  @AfterSuite
		public void suiteafter_I() {
		  
			System.out.println("inside AfterSuite");
		}
}
