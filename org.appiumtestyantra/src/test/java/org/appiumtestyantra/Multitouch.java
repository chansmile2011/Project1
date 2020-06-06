package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Multitouch {
	
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
		cap.setCapability("appPackage", "com.dmitrybrant.android.multitouch");
	 	cap.setCapability("appActivity", ".MultiTouchActivity");
	
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
	 	
	 	public void multitouchaction() throws InterruptedException
	 	{
	 	
	 		TouchAction touch1=new TouchAction(aDriver);
	 		touch1.longPress(605, 500).waitAction(5000);
	 		
	 		
	 		
	 		Thread.sleep(3000);
	 		
	 		TouchAction touch2=new TouchAction(aDriver);
	 		touch2.longPress(500, 900).waitAction(5000);
	 		
	 		Thread.sleep(3000);
	 		
	 		MultiTouchAction mtouch=new MultiTouchAction(aDriver);
	 		
	 		mtouch.add(touch1).add(touch2).perform();
	 		
	 	}
	 	
	 	
}


