package com.app.androidapp.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Settimepage  {
	

	AndroidDriver driver;
	
	public Settimepage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(accessibility="Views")
	private MobileElement viewlink;
	
	
	public void view() {
		viewlink.click();
	}
	
	@AndroidFindBy(accessibility="Date Widgets")
	private MobileElement datelink;
	
	
	public void date() {
		datelink.click();
	}
	
	@AndroidFindBy(accessibility="2. Inline")
	private MobileElement inlinelnk;
	
	
	public void inline() {
		inlinelnk.click();
	}
	
	@AndroidFindBy(id="android:id/toggle_mode")
	private MobileElement timelnk;
	
	
	public void time() {
		timelnk.click();
	}
	
	@AndroidFindBy(id="android:id/input_hour")
	private MobileElement hourData;
	
	
	public void clearHrdata()
	{
		hourData.clear();	
		
	}
	
	
	public void hour(String hour) {
		hourData.sendKeys(hour);
	}
	
	@AndroidFindBy(id="android:id/input_minute")
	private MobileElement minutedata;
	
	public void clearMindata()
	{
		minutedata.clear();	
		
	}
	public void minute(String minute) {
		minutedata.sendKeys(minute);
	}
	
	@AndroidFindBy(id="android:id/am_pm_spinner")
	private MobileElement spinnerLnk;
	
	
	public void spinner() {
		spinnerLnk.click();
	}
	
	@AndroidFindBy(uiAutomator="text(\"am\")")
	private MobileElement ampm;

	public void displayampm() {
		ampm.click();
	}
	
	@AndroidFindBy(id="android:id/toggle_mode")
	private MobileElement setTime;

	public void setTime() {
		setTime.click();
	}
	
	
	public void displaySetTime(String hr,String mn)
	{
		view();
		date();
		inline();
		time();
		clearHrdata();
		clearMindata();
		hour(hr);
		minute(mn);
		spinner();
		displayampm();
		setTime();
	}
}
