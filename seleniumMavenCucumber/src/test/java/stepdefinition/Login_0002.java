package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_0002 {
	
	WebDriver chromeDriver;
//	String userName = "a";
//	String password = "a";
	
	@Given("^I am on the travel portal \"([^\"]*)\"$")
	public void i_am_on_the_travel_portal(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	    System.setProperty("webdriver.chrome.driver", "/Users/venetabaeva/Documents/QA/drivers/chromedriver");
		chromeDriver = new ChromeDriver();
		chromeDriver.get(url);
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		  throw new PendingException(); 
	}

	@When("^I type login = \"([^\"]*)\" and password = \"([^\"]*)\"$")
	public void i_type_login_and_password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		chromeDriver.findElement(By.name("userName")).sendKeys(username);
		chromeDriver.findElement(By.name("password")).sendKeys(password);
//		  throw new PendingException();
		
	}

	@When("^I click sign-in button$")
	public void i_click_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		chromeDriver.findElement(By.name("submit")).click();
//		  throw new PendingException();
	}

	@Then("^I should get \"([^\"]*)\" link$")
	public void i_should_get_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}


}
