package com.script.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pages.tasks.CreateCustomer;

public class TestCreateCustomer extends BaseTest
{
	@Test
	public void customer() throws IOException
	{
		CreateCustomer cust=new  CreateCustomer(driver);
		cust.Customermethod();
	}

}
