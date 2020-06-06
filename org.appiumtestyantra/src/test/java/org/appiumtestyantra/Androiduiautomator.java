package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Androiduiautomator {
	
	
	public DesiredCapabilities cap;
	 
	 public AndroidDriver aDriver;
	 
	 	@BeforeTest
		
		public void launchApp() throws InterruptedException
		{
	 		
	 	cap=new DesiredCapabilities();
	 	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
	 	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
	 	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"SM-A107F");
	 	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2"  );
	 	cap.setCapability(MobileCapabilityType.UDID,"R9BMC005KVJ");
	 	
	 	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.sec.android.app.popupcalculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".Calculator");
		  
	 
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
	 		Thread.sleep(1000);
	 	aDriver.findElementByAndroidUIAutomator("text(\"9\")").click();
	 	
	 	Thread.sleep(1000);
	 
	 	aDriver.findElementByAndroidUIAutomator("text(\"×\")").click();
		Thread.sleep(1000);
	 	aDriver.findElementByAndroidUIAutomator("text(\"8\")").click();
		Thread.sleep(1000);
	 	aDriver.findElementByAndroidUIAutomator("text(\"=\")").click();
	 	
	 	String ans = aDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sec.android.app.popupcalculator:id/calc_edt_formula\")").getText();
	 		 	
	 	System.out.println(ans);
	 	}
	 	
	 	@AfterTest
	 	
	 	void closelaunch()
	 	{
	 		
	 		aDriver.quit();
	 	}

}
