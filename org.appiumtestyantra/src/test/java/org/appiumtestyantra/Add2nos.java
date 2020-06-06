package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Add2nos {
	
	public DesiredCapabilities cap;
	 
	 public AndroidDriver aDriver;
	 
	 	@BeforeTest
		
		public void launchApp() throws InterruptedException
		{
	 		
	 	cap=new DesiredCapabilities();
	 	cap.setCapability("automationName", "UIAutomator2");
	 	cap.setCapability("deviceName", "SM-A107F");
	 	cap.setCapability("platformName", "android");
	 	cap.setCapability("platformVersion", "9");
	 	cap.setCapability("UDID", "R9BMC005KVJ");
	  
	 	cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	 	cap.setCapability("appActivity", ".Calculator");
	 	
	
	 	try
	 	{
	 	aDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	 	
	 	System.out.println("ApiDemo has launched");
	 		
	 	}catch(MalformedURLException e)
	 	{
	 		
	 		e.printStackTrace();
	 	}

	 	
	 	
}
	 	
	 	@Test
	 	public void add() throws InterruptedException
	 	{
	 	aDriver.findElementByClassName("android.widget.TextView").click();
	 	
	 	aDriver.findElementByXPath("//android.widget.TextView[@content-desc='Controls']").click();
	 	
	 	aDriver.findElementByXPath("//android.widget.TextView[@content-desc='3. Holo Light Theme']").click();
	 	
	 	aDriver.findElementById("io.appium.android.apis:id/edit").sendKeys("saritha");
	 	
	 	
	 aDriver.hideKeyboard();
	 		
	 	}
	 	
	 	@AfterTest
	 	
	 	void closelaunch()
	 	{
	 		
	 		aDriver.quit();
	 	}
}
