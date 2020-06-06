package com.app.androidapp.pages;

import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SeekBarPage extends MobileActionUtil{
	

	AndroidDriver driver;
	
	public SeekBarPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility="Views")
	private MobileElement viewlink;
	
	
	public void view() {
		viewlink.click();
	}
	
	
public void displayscroll()
{
	view();
	SeekBarPage.scrollToElement(driver,"text","Seek Bar");
	
}
 

}