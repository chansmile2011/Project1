package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Automaticserversession {

private AppiumDriverLocalService service;
	
	private AppiumServiceBuilder builder;
	
	private int port=4723;
	
	public DesiredCapabilities cap;
	 
	 public AndroidDriver aDriver;
	@BeforeClass
	
	public void bf()
	{
		
builder=new AppiumServiceBuilder();
		
		builder.withIPAddress("0.0.0.0");
		
		builder.usingPort(port);
		
		service=AppiumDriverLocalService.buildService(builder);
		
		service.start();
		
	//	System.out.println("good");
		
		//service.stop();
			
	}
	
	@Test
	
	void data()
	{
	try{
	
	 	cap=new DesiredCapabilities();
	 	cap.setCapability("automationName", "UIAutomator2");
	 	cap.setCapability("deviceName", "SM-A107F");
	 	cap.setCapability("platformName", "android");
	 	cap.setCapability("platformVersion", "9");
	 	cap.setCapability("UDID", "R9BMC005KVJ");
		cap.setCapability("appPackage", "io.appium.android.apis");
	 	cap.setCapability("appActivity", ".ApiDemos");
	
	 
	 	aDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	 	
	 	System.out.println("ApiDemo has launched");
	 		
	 	}catch(MalformedURLException e)
	 	{
	 		
	 		e.printStackTrace();
	 	}

	 	
	 	
}
	
	@AfterClass
	void stopdata()
	{
		service.stop();
		
	}
	
}
