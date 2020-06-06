package com.app.androidapp.pages;

import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LogTextBoxPage {

	AndroidDriver driver;
	
	public LogTextBoxPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	/*
	@AndroidFindBy(uiAutomator="text(\"T-shirts\")")
	private MobileElement tshirts;

	public MobileElement getTshirts() {
		return tshirts;
	}
	
	public void tapOnTshirts() {
		tshirts.click();
	}
	
	*/
	@AndroidFindBy(accessibility="Text")
	private MobileElement txtlink;
	
	
	public void Textclick() {
		txtlink.click();
	}
	
	@AndroidFindBy(accessibility="LogTextBox")
	private MobileElement logtxtbx;
	
	
	public void logTextBox() {
		logtxtbx.click();
	}
	
	@AndroidFindBy(accessibility="Add")
	private MobileElement addbtn;
	
	
	public void add() {
		addbtn.click();
	}
	/*
	@AndroidFindBy(uiAutomator="text(\"This is a test\")")
	private MobileElement actualData;
	*/
	@AndroidFindBy(id="io.appium.android.apis:id/text")
	private MobileElement actualData;
	
	
	
	
	public void textLogTextBox()
	{
		txtlink.click();
		logtxtbx.click();
		addbtn.click();
		
	}
	
	public void verifytext()
	
	{
		
		String expdata="This is a test";
		String actdata = actualData.getText();
		
		System.out.println(actdata);
		
	//	Assert.assertEquals(expdata,actdata );
		
		if(actdata.contains(expdata))
			
		{
			System.out.println("Text are same");
		}
		else
		{
			
			System.out.println("Text are not same");
		}
	}
	
	
}
