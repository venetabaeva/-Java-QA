package seleniumMavenJUnitTestNG;

import org.testng.annotations.Test;

public class TNG_0007 {
	@Test(groups = "login")
	public void enterUsername() {
		System.out.println("enter username");
	}

	@Test(groups = "login",dependsOnMethods = "enterUsername" )
	public void enterPassword() {
		System.out.println("enter password");
	}
	@Test(groups = "login",dependsOnMethods = "enterPassword" )
	public void clickonLogin() {
		System.out.println("click on login button");
	}

	@Test(groups = "search", dependsOnMethods = "clickonLogin")
	public void selectLocation() {
		System.out.println("select location");
	}
	@Test(groups = "search",dependsOnMethods = "selectLocation" )
	public void selectPreferences() {
		System.out.println("select preferenece");
	}
	@Test(groups = "search",dependsOnMethods = "selectPreferences" )
	public void selectDate() {
		System.out.println("select dates");
	}
	@Test(groups = "search",dependsOnMethods = "selectDate")
	public void clickonSearch() {
		System.out.println("click on search");
	}
	
	@Test(groups= "logout",dependsOnGroups = "search")
	public void clickonLogout() {
		System.out.println("Click on logout button");
		System.out.println("Logout from flight reservation system");
	}
}
