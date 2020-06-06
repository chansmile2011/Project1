package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;

import com.app.androidapp.pages.SeekBarPage;

public class TC_004_TestScript4 extends BaseLib{
	
	
	@Test
	public void tc_004_testfour() throws IOException, InterruptedException
	{
		SeekBarPage scroll = new SeekBarPage(gv.driver);
	
		scroll.displayscroll();
	}
	
	

}
