package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Uicatalogdate {
	
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
		cap.setCapability("appPackage", "org.eniblo.uicatalog");
	 	cap.setCapability("appActivity", ".MainActivity");
	
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
	 	
	 		aDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 		aDriver.findElementByXPath("//android.view.View[@content-desc='Framework7 Material 1.4.0']").click();
	 		
	 		aDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 		//WebElement ele = aDriver.findElementByAccessibilityId("Floating Action Button");
	 		
	 		WebElement ele = aDriver.findElementByAccessibilityId("Grid");
	 		
	 		 		
	 		aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(ele))").click();

	 		
	 		aDriver.findElementByAccessibilityId("September").click();
	 		
	 		
	 		
	 		aDriver.findElementByXPath("(//android.view.View[@content-desc=\"31\"])[1]").click();
	 		
	 		
	 		aDriver.findElementByAccessibilityId("2021").click();
	 		
	 		aDriver.findElementByXPath("(//android.view.View[@content-desc=\"14\"])[2]").click();
	 		
	 		aDriver.findElementByXPath("(//android.view.View[@content-desc=\"31\"])[2]").click();
	 		
	 		
	 		
	 		
	 		
	 		
	 	}
	 	
	 	
	 	

}



