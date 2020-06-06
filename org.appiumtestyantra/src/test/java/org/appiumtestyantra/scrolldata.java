package org.appiumtestyantra;

import org.testng.annotations.Test;

public class scrolldata extends Fullreset{
	@Test
	
	public void scrollAction() throws InterruptedException
	{
	aDriver.findElementByAccessibilityId("Views").click();
	
	Thread.sleep(3000);
	aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))").click();

	
}
}