package com.fbistech.ExtentReportListener;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporterNG implements IReporter {
	
	
	public ExtentReporterNG extent;
	
	
	public ExtentReporterNG() 
	{
		super();
	}
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,  String outputDirectory) 
	{
		extent = new ExtentReporterNG();

		for (ISuite suite : suites) 
		{
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
			}
		}

		extent.flush();
		extent.close();
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}
	private void flush() {
		// TODO Auto-generated method stub
		
	}
	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) 
		{
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) 
				{
					test.log(status, result.getThrowable());
				} 
				else 
				{
					test.log(status, "Test " + status.toString().toLowerCase() + "ed");
				}

				extent.endTest(test);
			}
		}
	}

	private void endTest(ExtentTest test) {
		// TODO Auto-generated method stub
		
	}
	private ExtentTest startTest(String methodName) {
		// TODO Auto-generated method stub
		return null;
	}
	private java.util.Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
}