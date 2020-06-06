package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class webveiwdata {
	
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
		cap.setCapability("appPackage", "com.snc.test.webview2");
	 	cap.setCapability("appActivity", "com.snc.test.webview.activity.MainActivity");
	
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
	 		
	 		
	 		System.out.println(aDriver.getContext());
	 		aDriver.findElementById("com.snc.test.webview2:id/action_go_website").click();
	 	
	 	aDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	aDriver.findElementById("android:id/button1").click();
	 	
	 	Set con = aDriver.getContextHandles();
	 	
	 	for(Object a:con)
	 		
	 	{
	 	System.out.println(a.toString());
	 		
	 		
	 	}
	 	
    	aDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	aDriver.context("WEBVIEW_com.snc.test.webview2");

aDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



//aDriver.findElementByXPath("a[.='Images']").click();

//aDriver.findElementByXPath("//*[@name='q']").sendKeys("doll");

	
}
}