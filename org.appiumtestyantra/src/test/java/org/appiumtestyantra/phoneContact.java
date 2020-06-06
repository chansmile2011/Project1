package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class phoneContact {
	
	public DesiredCapabilities cap;
	 
	 public AndroidDriver aDriver;
	 
	
		@BeforeTest
		
		public void dial() throws InterruptedException
		{
	 		 	cap=new DesiredCapabilities();
	 		 	cap.setCapability("automationName", "UIAutomator2");
	 		 	cap.setCapability("deviceName", "SM-A107F");
	 		 	cap.setCapability("platformName", "android");
	 		 	cap.setCapability("platformVersion", "9");
	 		 	cap.setCapability("UDID", "R9BMC005KVJ");
	 		 	
	 		 	cap.setCapability("appPackage", "com.samsung.android.dialer");
	 		 	cap.setCapability("appActivity", ".DialtactsActivity");
	 		  
	 
	 	try
	 	{
	 	aDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	 	
	 	System.out.println("launched");
	 		
	 	}catch(MalformedURLException e)
	 	{
	 		
	 		e.printStackTrace();
	 	}

	 			}
	 	
	 	@Test
	 	public void dialsearch() throws InterruptedException
	 	{
	 		Thread.sleep(1000);
	 	aDriver.findElementByAndroidUIAutomator("text(\"Recents\")").click();
	 	Thread.sleep(5000);
	 	
	aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"dad\"))").click();
		
		
		aDriver.findElementByAccessibilityId("Call").click();


	
	 	
	 	}
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
}
