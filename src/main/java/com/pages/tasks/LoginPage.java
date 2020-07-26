package com.pages.tasks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.ExcelData;

public class LoginPage implements Autoconstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBoxChecbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginLink;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//div[@class='atLogoImg']")
	private WebElement logoLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginmethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelData.getcellvalue(excel_path, sheetname, 1, 0));
		passwordTextfield.sendKeys(ExcelData.getcellvalue(excel_path, sheetname, 1, 1));
		keepLoggedInCheckBoxChecbox.click();
		loginLink.click();
	}

}
