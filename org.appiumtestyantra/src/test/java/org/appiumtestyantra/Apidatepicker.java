package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Apidatepicker {
	
	
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
		
	 	aDriver.findElementByAccessibilityId("Date Widgets").click();
	 	
	 	aDriver.findElementByAccessibilityId("2. Inline").click();
	 	
	 	aDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	aDriver.findElementById("android:id/toggle_mode").click();
	 	
	 	aDriver.findElementById("android:id/input_hour").clear();
	 	
	 	aDriver.findElementById("android:id/input_minute").clear();
	 	
	 	aDriver.findElementById("android:id/input_hour").sendKeys("06");
	 	
	 	aDriver.findElementById("android:id/input_minute").sendKeys("45");
	 	
	 	aDriver.findElementById("android:id/am_pm_spinner").click();
	 	
	 	 aDriver.findElementByAndroidUIAutomator("text(\"am\")").click();	
	 	
	 	aDriver.findElementById("android:id/toggle_mode").click();
	 	 
	 
	 	
	 	
	 	
	 	
	 		
	 	}
	 		
	 	


}
