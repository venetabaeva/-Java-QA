package seleniumMavenJUnitTestNG;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG_0003 {
	
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
}
