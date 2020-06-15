package stepdefinitionfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class example {
	
	@Given("^navigate to application$")
	public void navigate_to_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Hello");
	}

}
