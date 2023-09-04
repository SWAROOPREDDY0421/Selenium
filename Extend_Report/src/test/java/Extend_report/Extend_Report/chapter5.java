package Extend_report.Extend_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class chapter5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

		ExtentReports extent = new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\SWAROOP REDDY\\eclipse-workspace\\Selenium_Practise\\Extend_Report\\Reports\\sample.html");
		extent.attachReporter(spark);
		
		
		extent.createTest("Text based Test")
		.log(Status.INFO, "INFO1")
		.log(Status.INFO, "<b>INFO2</b>")
		.log(Status.INFO, "<i>INFO3</i>")
		.log(Status.INFO, "<b><i>INFO3</i></b>");
		
		String xmlData="<menu id=\"file\" value=\"File\">\r\n"
				+ "  <popup>\r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
				+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
				+ "  </popup>\r\n"
				+ "</menu>";
		
		String JsonData="{\"menu\": {\r\n"
				+ "  \"id\": \"file\",\r\n"
				+ "  \"value\": \"File\",\r\n"
				+ "  \"popup\": {\r\n"
				+ "    \"menuitem\": [\r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}}";
		
		extent
		.createTest("Xml based Test")
		.info(MarkupHelper.createCodeBlock(xmlData,CodeLanguage.XML));
		
		
		extent
		.createTest("Json Based Test")
		.log(Status.INFO, MarkupHelper.createCodeBlock(JsonData));
		
		extent.flush();
		
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
