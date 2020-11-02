package seleniumMavenJUnitTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG_0005 {
	
	@BeforeSuite //  the annotated method will run only once before all  tests in this suite have run 
	public void suitebefore_I() {
		System.out.println("Initialize source within DB  - inside BeforeSuite");
	}
	
	@BeforeTest // the annotated method will be run before any test method belonging to the class inside  the <test> is runtag  
	public void before_I() {
		System.out.println("Set System Driver Properties & Drive browser - inside BeforeTest");
	}
	
	@BeforeClass//The annotated method will be run only once before the first test method in the current class is invoked 
	public void connect_I() {
		System.out.println("Get credentials & Set credentials into an object from DB - inside BeforeClass"); //once before test method
		System.out.println("Get Url & Set Url into an object - inside BeforeClass"); //once before test method

	}
	
	@BeforeMethod// the annotated method will be run before each test method 
	  public void initialize_I(){
		  System.out.println("inside BeforeMethod");
			
		}
		
	  @Test//marks a class or a method as a part of a test 
	  public void test_method_I_0001login() {
		  System.out.println("Get the set credentials from the data object - inside Login");
		  System.out.println("Pass the credentials from the data object to the WebElements within the Browser  - inside Login");
	  }
	  
	  @Test
	  public void test_method_I_0002login() {
		  System.out.println(" Within page methods on WebElements inside Logout - inside logged in space");
	  }
	  
	  @AfterMethod// the annotated method will be run after each test method 
		public void close_nizialized_I(){
		  System.out.println("inside AfterMethod");
		}
	  @AfterClass///The annotated method will be run only once after the first test method in the current class is invoked 
		public void terminate_connect_I() {
			System.out.println("Remove user object from test suite - inside AfterClass"); //once after all test method within the class are executed

		}
	  
	  @AfterTest // the annotated method will be run after any test method belonging to the class inside  the <test> is run tag  
		public void after_I() { // once the execution of all the tests are completed 
		  System.out.println("Drive browser to close browser inside AfterTest");
		}
	  
	  @AfterSuite//the annotated method will be run only once after all tests in this suite have run 
		public void suiteafter_I() {
		  
			System.out.println("terminate the connection to the source within DB - inside AfterSuite");
		}
	  
	  @DataProvider // marks a method as supplying for a test method . The annotated method must return an Object[] [], where each Object [] can be assigned a parameter list of the test method . The @Test method that wants to receive data from that Data Provider needs to use dataProvider name eqals to teh name of this annotation 
	  public void data_provider_I() {
		  
	  }
	  @Factory // Marks a method as a factory that returns objects that will be used by TestNG as Test Classes. Test must return Object[]
	  public void factory_provider_I() {
		  
	  }
	  
	
	  @Parameters // describes how to pass parameters to a @Test method 
	  public void parameter_I(){
		  
	  }
}
