package org.appiumtestyantra;

import org.testng.annotations.Test;

public class test1 extends Launch{
	@Test
	
	void dispmethods() throws InterruptedException
	{
	/*
aDriver.startActivity("com.sec.android.app.popupcalculator", ".Calculator");	
 	
 	aDriver.launchApp();
 	*/
 	aDriver.unlockDevice();
 	
 	System.out.println(aDriver.isLocked());
 	/*
 	aDriver.lockDevice();
 	
 	Thread.sleep(3000);
 	
 	System.out.println(aDriver.isLocked());
 	*/
 	aDriver.openNotifications();
 	
 	aDriver.hideKeyboard();
	
	}

}
