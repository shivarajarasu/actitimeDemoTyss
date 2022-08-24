package com.actitime.testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class Practice2 extends BaseClass{

	@Test(groups="smokeTest")
	public void createProjectTest()
	{
		System.out.println("Task assigned");
		driver.get("https://flipkart.com/");
	}
	
	@Test(groups="regressionTest")
	public void editProjectTest()
	{
		System.out.println("Edit Contact");
	}
	
	@Test(groups="regressionTest")
	public void deleteProjectTest()
	{
		System.out.println("Contact Deleted");
	}
}

