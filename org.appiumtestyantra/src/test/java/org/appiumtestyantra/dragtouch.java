package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class dragtouch {
	
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
		cap.setCapability("appPackage", "com.mobeta.android.demodslv");
	 	cap.setCapability("appActivity", ".Launcher");
	
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
	 	
	 	public void dragging()
	 	{
	 		
	 	aDriver.findElementById("android:id/button1").click();
	 		
	 	aDriver.findElementByAndroidUIAutomator("text(\"Basic usage playground\")").click();
	 	
	 	//aDriver.findElementByAndroidUIAutomator("text(\"Basic usage playground\")").click();
	 	
	List element = aDriver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
	WebElement ChickCorea = (WebElement)element.get(2); 	
	
	WebElement Wayneshorter = (WebElement)element.get(5);
	
	TouchAction touch1=new TouchAction(aDriver);
		touch1.longPress(ChickCorea).moveTo(Wayneshorter).release().perform();
	 
	 	
	 	}
	 	
	 	
}
