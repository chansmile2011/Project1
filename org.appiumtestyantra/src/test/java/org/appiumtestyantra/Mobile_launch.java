package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Mobile_launch {
	
	public DesiredCapabilities cap;
	 
	 public AndroidDriver aDriver;
	 
	 	@BeforeTest
		
		public void launchApp() throws InterruptedException
		{
	 	try{	
	 	cap=new DesiredCapabilities();
	  	cap.setCapability("deviceName", "SM-A107F");
	 	cap.setCapability("platformName", "android");
	 	cap.setCapability("platformVersion", "9");
	 	cap.setCapability("UDID", "R9BMC005KVJ");
	cap.setCapability("browserName", "chrome");

	 	aDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	 	
	 	System.out.println("launched");
	 		
	 	}catch(MalformedURLException e)
	 	{
	 		
	 		e.printStackTrace();
	 	}

	 	
	 	
}
	 	@Test
	 	public void add() throws InterruptedException
	 	{
	 System.out.println("Browser launched");
	 Thread.sleep(3000);
	 
	 aDriver.get("http:\\www.facebook.com");
	 

	 aDriver.findElementByXPath("//input[@id='m_login_email']").sendKeys("chandsaritha@gmail.com");
	 aDriver.findElementByXPath("//input[@id='m_login_password']").sendKeys("jesus19800");
	aDriver.findElementByXPath("//*[@name='login']").click();

	 	
	 	}
	 	
	

}
