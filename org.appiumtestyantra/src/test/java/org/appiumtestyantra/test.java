package org.appiumtestyantra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	static
	{
	System.setProperty("webdriver.chrome.driver", "D:/driver/drve83/chromedriver.exe");
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	}

}
