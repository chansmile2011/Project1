package stepdefinitionfile;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	void before()
	{
		System.out.println("Before");
		
	}
	
	@After
	void after()
	
	{
		
		System.out.println("After");
	}
	
	@Before("@smoke")
	void smokebefore()
	{
		System.out.println("smoke data");
		
	}

}
