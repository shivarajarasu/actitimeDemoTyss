package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnerImplementation implements ITestListener{
	public void onTestFailure(ITestResult result) {
		JavaUtility jLib=new JavaUtility();
		String sysDate = jLib.getSystemDate();
		int random = jLib.getRandomNumber();
		String testName=result.getMethod().getMethodName();
		System.out.println(testName+"======Execute and I am Listening======");
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.stdriver);
		File src=eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./screenshot/"+sysDate+testName+random+".png"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
	
