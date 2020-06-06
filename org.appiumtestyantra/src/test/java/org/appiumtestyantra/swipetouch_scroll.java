package org.appiumtestyantra;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

public class swipetouch_scroll extends Fullreset{
	
	public int startx;
	public int starty;
	public int endx;
	public int endy;
	
	@Test
	
	public void swipeBottomToTop() throws InterruptedException
	{
	aDriver.findElementByAccessibilityId("Views").click();
	
	Thread.sleep(3000);
	
	Dimension size = aDriver.manage().window().getSize();
	
	System.out.println(size);
	
	int width=size.getWidth();
	int height=size.getHeight();
	startx=(int)width/2;
	endx=startx;
	starty=(int)(height*0.8);
	endy=(int)(height*0.2);
	
	
TouchAction action=new TouchAction(aDriver);
action.press(startx, starty).moveTo(endx,endy).release().perform();


}



}
