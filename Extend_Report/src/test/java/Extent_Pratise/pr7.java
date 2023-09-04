package Extent_Pratise;

import java.awt.Desktop;
import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class pr7 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		ExtentReports extent=new ExtentReports();
		File file=new File("reports.html");
		
		ExtentSparkReporter spark=new ExtentSparkReporter(file);
		ExtentSparkReporterConfig config=spark.config();
		extent.attachReporter(spark);
		
		config.setTheme(Theme.DARK);
		config.setReportName("Report Swaroop");
		config.setDocumentTitle("DOC-Title");
		config.setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
		config.setCss("");
		
		extent.createTest("Test1")
		.info("this Extent repoer configurations");
		
		
		extent.flush();
		Desktop.getDesktop().browse(new File("reports.html").toURI());
	}

}
