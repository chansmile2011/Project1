package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class displayStar {
	
	
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
	 	
	 	System.out.println("launched");
	 		
	 	}catch(MalformedURLException e)
	 	{
	 		
	 		e.printStackTrace();
	 	}

	 	
	 	
}
	 	@Test
	 	public void add() throws InterruptedException
	 	{
	 	aDriver.findElementByAccessibilityId("Views").click();
	 	aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
	 	WebElement star = aDriver.findElementById("io.appium.android.apis:id/ratingbar2");
	 
	 	int startX = star.getLocation().getX();
	 		
	 	System.out.println(startX);
	 	
	 	 int endX = star.getSize().getWidth();
	 	 
	 	int Yaxis = star.getLocation().getY();
	 	
	 	int tapAt = (int) (endX * 0.9); 
	 	
	 	TouchAction act=new TouchAction(aDriver);  
	 	  act.press(tapAt,Yaxis).release().perform();
	 	
	    
	 		
	 	}
	 	
}
