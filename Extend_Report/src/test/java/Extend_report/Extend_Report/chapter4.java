package Extend_report.Extend_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class chapter4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ExtentReports extent = new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(file);
		extent.attachReporter(spark);
		
		
		extent.createTest("Test1")
		.log(Status.INFO, "INFO1")
		.log(Status.INFO, "INFO2")
		.log(Status.INFO, "INFO3")
		.log(Status.PASS, "PASS1")
		.log(Status.PASS, "PASS2")
		.log(Status.SKIP, "SKIP1")
		.log(Status.SKIP, "SKIP2")
		.log(Status.SKIP, "SKIP3")
		.log(Status.WARNING, "WARNING1")
		.log(Status.WARNING, "WARNING2")
		.log(Status.FAIL, "FAIL1")
		.log(Status.FAIL, "FAIL2");
		
		
		
		
		
		
		
		extent.flush();
		
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
