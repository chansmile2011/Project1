package org.appiumtestyantra;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class bigBasket {
	
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
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
	 	cap.setCapability("appActivity", ".activity.SplashActivity");
	
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
	 	 
	 		  aDriver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();	
	 		
	 	
	 
	 	//	aDriver.findElementById("com.bigbasket.mobileapp:id/text_login").click();	
	 	
	 		Thread.sleep(3000);
	 	
	 		aDriver.findElementById("com.bigbasket.mobileapp:id/imgCloseIcon").click();
	 				
	 				
	 		aDriver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
	 		
	 		aDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 		aDriver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("mango");
	 		aDriver.pressKeyCode(AndroidKeyCode.ENTER);
	 		
	 		WebElement mangodata = aDriver.findElementByAndroidUIAutomator("text(\"Banganapalli Mango\")");	
	 		
	 		String srchmango = mangodata.getText();
	 		
	 		System.out.println(srchmango);
	 		
	 		aDriver.findElementByAndroidUIAutomator("text(\"ADD\")").click();	
	 		
	 		aDriver.findElementByAndroidUIAutomator("text(\"Basket\")").click();	
	 	
	 		WebElement basketmango = aDriver.findElementByAndroidUIAutomator("text(\"Fresho - Banganapalli Mango\")");
	 	
	 		String bskmango = basketmango.getText();
	 		
	 		System.out.println(bskmango);
	 		
	 		
	 		aDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 		
	 		
	 		
	 		if(srchmango.endsWith(bskmango))
	 		{
	 			
	 			System.out.println("Searched Item is same");
	 		}
	 		else
	 		{
	 			System.out.println("Not same");
	 			
	 		}
	 		

}
}