package org.appiumtestyantra;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class startserver {
	
	
	
	private AppiumDriverLocalService service;
	
	private AppiumServiceBuilder builder;
	
	private int port=4723;
	
	@Test
	
	public void start()
	{
		builder=new AppiumServiceBuilder();
		
		builder.withIPAddress("0.0.0.0");
		
		builder.usingPort(port);
		
		service=AppiumDriverLocalService.buildService(builder);
		
		service.start();
		
	//	System.out.println("good");
		
		service.stop();
		
		
		
		
	}
	
	
	
	
	

}
