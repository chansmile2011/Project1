package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Launch {
	
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
  //  cap.setCapability("app", "C:\\Users\\saritha\\Downloads\\ApiDemos-debug.apk");
 	
 	cap.setCapability("appPackage", "io.appium.android.apis");
 	cap.setCapability("appActivity", ".ApiDemos");
 	
 /*
 	cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
 	cap.setCapability("appActivity", ".Calculator");
 	
 */
 	try
 	{
 	aDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
 	
 	System.out.println("ApiDemo has launched");
 		
 	}catch(MalformedURLException e)
 	{
 		
 		e.printStackTrace();
 	}
 	
 	//aDriver.close();
 	
/* aDriver.runAppInBackground(5);
 	
 	ScreenOrientation or = aDriver.getOrientation();
 	
 	System.out.println(or);
 aDriver.rotate(ScreenOrientation.LANDSCAPE);
 	Thread.sleep(3000);
 	
 	aDriver.rotate(ScreenOrientation.PORTRAIT);
 	
 	*/
 	
	}

}
