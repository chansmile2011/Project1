package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.HoloLightPage;
import com.app.androidapp.pages.SeekBarPage;

public class TC_005_TestScript5 extends BaseLib{
	
	@Test
	public void tc_005_testfive() throws IOException, InterruptedException
	{
		HoloLightPage d = new HoloLightPage(gv.driver);
	
		d.dropdown();
	}
	

}
