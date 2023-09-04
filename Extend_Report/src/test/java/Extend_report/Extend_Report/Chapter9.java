package Extend_report.Extend_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Chapter9 {

	public static void main(String[] args) throws Exception {
		
		ExtentReports extent = new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(file);
		ExtentSparkReporterConfig config=spark.config();
		extent.attachReporter(spark);
		
		
//		config.setTheme(Theme.DARK);
//		config.setReportName("Report name");
//		config.setDocumentTitle("Doc title");
//		config.setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
//		config.setCss(".badge-primary{background-color:#da0b2b}");
//		config.setJs("document.getElementsByClassName('logo')[0].style.display='none'");
		
//		spark.loadJSONConfig(new File("./src/test/resources/extent-report-config.json"));
		
		spark.loadXMLConfig("./src/test/resources/extent-report-config.xml");
		
		
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
		.warning("This is a Failed Test");
		
		extent
		.createTest("Test 6")
		.assignAuthor(new String[] {"Raju","RAMU","NIRIV"})
		.assignCategory(new String[] {"smoke","E2E","beta"})
		.assignDevice(new String[] {"chrome 99","Firefox 60","Edge 99"})
		.warning("This is a Failed Test");
		
		extent.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
