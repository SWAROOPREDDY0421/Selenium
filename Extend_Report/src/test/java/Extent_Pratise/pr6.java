package Extent_Pratise;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class pr6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		ExtentReports extent=new ExtentReports();
		File file=new File("reports.html");
		ExtentSparkReporter spark=new ExtentSparkReporter(file);
		extent.attachReporter(spark);
		
		extent.createTest("Test 1")
		.assignAuthor("swaroop")
		.assignCategory("smoke")
		.assignDevice("chrome")
		.info("This is test1");
		
		extent.createTest("Test 2")
		.assignAuthor("sai")
		.assignCategory("smoke")
		.assignDevice("firefox")
		.info("This is test2");
		
		extent.createTest("Test 3")
		.assignAuthor("mahi")
		.assignCategory("regression")
		.assignDevice("chrome")
		.info("This is test3");
		
		extent.createTest("Test 4")
		.assignAuthor("Raju")
		.assignCategory("Reseting")
		.assignDevice("edge")
		.info("This is test4");
		
		extent.flush();
		Desktop.getDesktop().browse(new File("reports.html").toURI());

		
		
	}

}
