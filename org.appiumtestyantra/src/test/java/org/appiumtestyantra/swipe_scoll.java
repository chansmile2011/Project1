package org.appiumtestyantra;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class swipe_scoll extends Fullreset{
	
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
	
	//bottom to top window moving
	for(int i=0;i<2;i++)
	{
	aDriver.swipe(startx, starty, endx, endy, 3000);
	}
}



@Test

public void swipeToptoBottom() throws InterruptedException
{

aDriver.swipe(startx, endy, endx, starty, 3000);
}

}

