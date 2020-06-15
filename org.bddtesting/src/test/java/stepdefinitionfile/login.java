package stepdefinitionfile;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class login {
	/*
	@Before
	void databf()
	{
		System.out.println("Before");
		
	}
	@After
	void dataaf()
	{
		System.out.println("after");
		
	}
	*/
	static WebDriver driver;
	@Given("^Browser is open$")
	public void browser_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
System.setProperty("webdriver.chrome.driver", "D:\\driver\\drve83\\chromedriver.exe");
		
		driver=new ChromeDriver();

	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http:\\www.facebook.com");
	}
	@When("^user enters the username and password$")
	public void user_enters_the_username_and_password(DataTable arg1) throws Throwable {
	    
		Thread.sleep(3000);
	   List<Map<String,String>> data=arg1.asMaps(String.class,String.class);
	   for(Map<String,String>userData:data)
	   {
		   System.out.println("username"+userData.get("username")+"password:"+userData.get("password"));
		   
	   }
			   
	  
			   
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	  
	}
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();  
	
	}

	@Then("^The Homepage should be displayed$")
	public void the_Homepage_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		
String etitle="Facebook – log in or sign up";
		
		String atitle = driver.getTitle();
		
		Assert.assertEquals(atitle, etitle);
		
		driver.quit();

	}




	
}
