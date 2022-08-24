package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class Practice1 extends BaseClass{

	@Test(groups="smokeTest")
	public void createTaskTest()
	{
		
		System.out.println("Task assigned");
		//assert.fail();
		/*SoftAssert sa=new SoftAssert();
		sa.fail();
		System.out.println("Soft assert Task assigned");
		driver.findElement(By.id("email")).sendKeys("asmita");
		sa.assertAll();*/
	}
	
	@Test(groups="regressionTest")
	public void editTaskTest()
	{
		System.out.println("Edit Contact");
	}
	
	@Test(groups="regressionTest")
	public void deleteTaskTest()
	{
		System.out.println("Contact Deleted");
	}
}