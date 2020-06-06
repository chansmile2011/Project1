package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.app.androidapp.pages.Settimepage;



public class TC_003_TestScript3 extends TC_001_TestScript1 {
	
	@Test
	public void tc_003_testthree() throws IOException, InterruptedException
	{
		
		Settimepage time = new Settimepage(gv.driver);
					
		time.displaySetTime("06", "45");
		
		
	
	}

}
