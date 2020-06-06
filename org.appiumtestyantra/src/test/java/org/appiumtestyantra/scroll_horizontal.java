package org.appiumtestyantra;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

public class scroll_horizontal extends Fullreset{
	
@Test
	
	public void scrollAction() throws InterruptedException
	{
	aDriver.findElementByAccessibilityId("Views").click();
	
	Thread.sleep(3000);
	aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))").click();

	WebElement sideBar = aDriver.findElementById("io.appium.android.apis:id/seek");
	Point loc = sideBar.getLocation();
	
	int startx=loc.getX();
	int starty=loc.getY();
	
	Thread.sleep(1000);
	int endx = (int)(sideBar.getSize().getWidth()*0.80);
	int endy=starty;
	Thread.sleep(1000);
//	aDriver.swipe(startx, starty, endx, endy, 5000);
	
	
	Thread.sleep(1000);
		
	TouchAction action=new TouchAction(aDriver);

	action.press(startx, starty).moveTo(endx,endy).release().perform();

	aDriver.quit();
	
	
	
}
	
	
	

}
