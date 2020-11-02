package seleniumMavenJUnitTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TNG_0008 {//Assertion/ Test Case Priority & Skip Test if method fails to skip
  @Test(priority = 1)
  public void open_log_in_page_0001() {
	  System.out.println("open Log In Page");
  }
  @Test(priority = 2)
  public void check_log_in_0001() {
	  System.out.println("test Log In Page");
	  Assert.assertEquals("logged in successfull", "successfull");
  }
  @Test(priority = 3, dependsOnMethods = "check_log_in_0001")
  public void execute_log_out_0001() {
	  System.out.println("execute Log Out from Page");
  }
  
}
