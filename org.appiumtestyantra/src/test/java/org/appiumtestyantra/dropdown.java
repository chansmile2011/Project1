package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class dropdown {
	
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
		aDriver.findElementByAccessibilityId("Controls").click();
		
		
	 	Thread.sleep(3000);
		aDriver.findElementByAccessibilityId("3. Holo Light Theme").click();
		
		
	 	Thread.sleep(3000);
		
	 	
	 	
	    aDriver.hideKeyboard();
	    
	    aDriver.findElementByAndroidUIAutomator("text(\"Mercury\")").click();
	    
		    
		aDriver.findElementByAndroidUIAutomator("text(\"Jupiter\")").click();
	    
	    
	   
	    /*
	    
	 	List drop = aDriver.findElementsById("android:id/text1");
	 	
	 	int len = drop.size();
	 	
	 	int no=1;
	 	for(int i=0;i<len;i++)
	 	{
	 		
	 		 MobileElement items=(MobileElement)drop.get(i);
	 		 System.out.println(no+" "+items.getText());
	 		 no++;
	 	}
	    
	    
	    */
	 	}
	 	
	

}
