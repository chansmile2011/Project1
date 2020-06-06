package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class apidemo {
	
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
		cap.setCapability("appPackage", "io.appium.android.apis");
	 	cap.setCapability("appActivity", ".ApiDemos");
	
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
	 	aDriver.findElementByAccessibilityId("Views").click();
	 	
	 	Thread.sleep(3000);
		aDriver.findElementByAccessibilityId("Controls").click();
		
		
	 	Thread.sleep(3000);
		aDriver.findElementByAccessibilityId("3. Holo Light Theme").click();
		
		
	 	Thread.sleep(3000);
		aDriver.findElementById("io.appium.android.apis:id/edit").sendKeys("saritha");
	 	
	 	
	    aDriver.hideKeyboard();
	 		
	 	}
	 	
	 	@AfterTest
	 	
	 	void closelaunch()
	 	{
	 		
	 		aDriver.quit();
	 	} 	
	 	

}
