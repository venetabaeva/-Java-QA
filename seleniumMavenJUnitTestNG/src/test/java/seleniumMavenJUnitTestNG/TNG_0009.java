package seleniumMavenJUnitTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNG_0009 {
	
	@Test(dataProvider="Parameters")
	
	  public void test_method_0001(String username,String password) {
	   
	 System.out.println(username + " " + password);
	
	  }
	   
	
	
	  @DataProvider
	 
	 public Object[][] Parameters(){
		 
	 return new Object[][] {

			  { "infotek", "infotek" }, 

			 { "qatraining", "qatraining" }
	
		  
		  };
}
}
