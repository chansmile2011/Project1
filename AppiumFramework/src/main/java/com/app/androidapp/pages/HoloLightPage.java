package com.app.androidapp.pages;

import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HoloLightPage extends MobileActionUtil{
	

	AndroidDriver driver;
	
	public HoloLightPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility="Views")
	private MobileElement viewlink;
	
	
	public void view() {
		viewlink.click();
	}

	@AndroidFindBy(accessibility="Controls")
	private MobileElement cntrlink;
	
	
	public void Controls() {
		cntrlink.click();
	}
	
	@AndroidFindBy(accessibility="3. Holo Light Theme")
	private MobileElement holeLink;
	
	
	public void HoloLight() {
		holeLink.click();
	}
	
	@AndroidFindBy(uiAutomator="text(\"Mercury\")")
	private MobileElement mercurylnk;

	public void Mercury() {
		mercurylnk.click();
	}
	
	@AndroidFindBy(uiAutomator="text(\"Jupiter\")")
	private MobileElement jupiterlnk;

	public void Jupiter() {
		jupiterlnk.click();
	}
	
	
	public void dropdown()
	{
		view();
		Controls();
		HoloLight();
		HoloLightPage.hideKeyboard(driver);
		Mercury();
		Jupiter();
		
	}
	
}
