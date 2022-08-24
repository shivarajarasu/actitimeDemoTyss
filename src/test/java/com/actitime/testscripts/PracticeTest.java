package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class PracticeTest  extends BaseClass{
	@Test(groups="smokeTest")
	public void createContactTest()
	{
		//Assert.fail();
		driver.get("https://google.com/");

	}
	@Test(groups="regressionTest")
	public void editContactTest()
	{
		System.out.println("Edit Contact");
		//Assert.assertEquals("A", "B");
		
	}
	
	@Test(groups="regressionTest")
	public void deleteContactTest()
	{
		System.out.println("Contact Deleted");
	}   
 
}

//NOTE: run one test case in command Line: mvn -Dtest=PracticeTest#createContactTest test 