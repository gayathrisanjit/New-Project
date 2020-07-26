package com.generics.actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.tasks.LoginPage;

public class BaseTest implements Autoconstant
{
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() throws IOException
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		

		LoginPage login=new LoginPage(driver);
		login.loginmethod();
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	

	

}
