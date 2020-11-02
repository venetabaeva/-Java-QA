package seleniumMavenJUnitTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG_0006 {
	
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
	public void close_inizialized_I(){
	  System.out.println("inside AfterMethod");
	}
	
}
