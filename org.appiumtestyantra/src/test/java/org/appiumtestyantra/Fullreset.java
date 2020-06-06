package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Fullreset {
	 public DesiredCapabilities cap;
	 
	 public AndroidDriver aDriver;
	 
	 	@Test
		
		public void launchApp() throws InterruptedException
		{
	 		
	 	cap=new DesiredCapabilities();
	 	cap.setCapability("automationName", "UIAutomator2");
	 	cap.setCapability("deviceName", "SM-A107F");
	 	cap.setCapability("platformName", "android");
	 	cap.setCapability("platformVersion", "9");
	 	cap.setCapability("UDID", "R9BMC005KVJ");
	    cap.setCapability("app", "C:\\Users\\saritha\\Downloads\\ApiDemos-debug.apk");
	 	
	 //	cap.setCapability("fullReset", "true");
	 	cap.setCapability("noReset", "true");
	 	
	 	try
	 	{
	 	aDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	 	
	 	System.out.println("ApiDemo has launched");
	 		
	 	}catch(MalformedURLException e)
	 	{
	 		
	 		e.printStackTrace();
	 	}
	 	
	

}
}