package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.app.androidapp.pages.LandingPage;
import com.app.androidapp.pages.LogTextBoxPage;


public class TC_002_TestScript2 extends TC_001_TestScript1{
	
	@Test
	public void tc_002_testtwo() throws IOException, InterruptedException
	{
		
		LogTextBoxPage text = new LogTextBoxPage(gv.driver);
		
		text.textLogTextBox();
		
		text.verifytext();
	
	}
	
	

}
