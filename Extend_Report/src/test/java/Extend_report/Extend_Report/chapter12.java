package Extend_report.Extend_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;

public class chapter12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExtentReports extent = new ExtentReports();
		
		ExtentSparkReporter spark_all = new ExtentSparkReporter("AllTest.html");
		
		ExtentSparkReporter spark_Failed = new ExtentSparkReporter("FailedTest.html");
		spark_Failed.filter().statusFilter().as(new Status[]{
			Status.FAIL
		}).apply();
		
		ExtentSparkReporter spark_Skip = new ExtentSparkReporter("SkipTest.html");
		spark_Skip.filter().statusFilter().as(new Status[] {
				Status.SKIP,
				Status.WARNING
		}).apply();
		extent.attachReporter(spark_all,spark_Failed,spark_Skip);
		
	
		
		extent
		.createTest("Test 1","TestDesc")
		.assignAuthor("SWAROOP REDDY")
		.assignCategory("smoke")
		.assignDevice("Chrome 99")
		.pass("This is a Passed Test");
		

		extent
		.createTest("Test 2","Test solve")
		.assignAuthor("MAHESH")
		.assignCategory("Regreassion")
		.assignDevice("Edge 99 ")
		.fail("This is a Failed Test");
		

		extent
		.createTest("Test 3")
		.assignAuthor("RAMU")
		.assignCategory("Sanity")
		.assignDevice("Firefox 99")
		.warning("This is a Failed Test");
		
		extent
		.createTest("Test 4","Test Multiple")
		.assignDevice("Chrome 99")
		.assignCategory("smoke")
		.assignDevice("Firefox 99")
		.assignAuthor("SWAROOP REDDY")
		.assignDevice("Edge 99")
		.assignCategory("Sanity")
		.assignAuthor("RAMU")
		.pass("THis is Test pass");
		
		extent
		.createTest("Test 5")
		.assignAuthor("Cheytan","MAHESH")
		.assignCategory("alpha","smoke")
		.assignDevice("Firefox 99","Edge 99")
		.skip("This is a Failed Test");
		
		extent
		.createTest("Test 6")
		.assignAuthor(new String[] {"Raju","RAMU","NIRIV"})
		.assignCategory(new String[] {"smoke","E2E","beta"})
		.assignDevice(new String[] {"chrome 99","Firefox 60","Edge 99"})
		.warning("This is a Failed Test");
		
		extent.flush();
	Desktop.getDesktop().browse(new File("AllTest.html").toURI());
	Desktop.getDesktop().browse(new File("FailedTest.html").toURI());
	Desktop.getDesktop().browse(new File("SkipTest.html").toURI());
	}

		
	}


