package com.pages.tasks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Autoconstant;
import com.generics.actitime.ExcelData;

public class CreateCustomer implements Autoconstant
{
	@FindBy(id="container_tasks")
	private WebElement taskLink;

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewLink;

	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createnewcustomerLink;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerdescriptionTextfield;

	@FindBy(xpath="(//div[.='- Select Customer -'])[3]")
	private WebElement selectcustomerDropdown;

	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerLink;
	
	public CreateCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Customermethod() throws IOException
	{
		taskLink.click();
		addnewLink.click();
		createnewcustomerLink.click();
		entercustomernameTextfield.sendKeys(ExcelData.getcellvalue(excel_path, sheetname1, 1, 0));
		customerdescriptionTextfield.sendKeys(ExcelData.getcellvalue(excel_path, sheetname1, 1, 1));
		//selectbyvisibletext(selectcustomerDropdown, "Select Customer");
		createcustomerLink.click();
	}



}
