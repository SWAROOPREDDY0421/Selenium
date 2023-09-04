package Extend_report.Extend_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter6 {

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
		
		
		List<String> listData=new ArrayList<>();
		listData.add("Ravi");
		listData.add("Suresh");
		listData.add("Seshu");
		
		Map<Integer,String> MapData=new HashMap<>();
		MapData.put(101, "Ravi");
		MapData.put(102, "Suresh");
		MapData.put(103, "Seshu");
		
		Set<Integer> SetData=MapData.keySet();
		
		extent
		.createTest("List based Test")
		.info(MarkupHelper.createOrderedList(listData))
		.info(MarkupHelper.createUnorderedList(listData));
		
		
		extent
		.createTest("Map Based Test")
		.info( MarkupHelper.createOrderedList(MapData))
		.info(MarkupHelper.createUnorderedList(MapData));
		
		extent
		.createTest("Set based Test")
		.info( MarkupHelper.createOrderedList(SetData))
		.info(MarkupHelper.createUnorderedList(SetData));
		
		extent
		.createTest("Highlight log based Test")
		.info("his is  not Highlighted Message")
		.info(MarkupHelper.createLabel("This is Highlighted Message", ExtentColor.RED));
		
		try {
			int i=5/0;
		}
		catch(Exception e){
			extent
			.createTest("Exception Test")
			.info(e)
			.fail(e);
		}
		
		Throwable t=new RuntimeException("This is Customize Exception");
		extent
		.createTest("customize Test")
		.info(t)
		.fail(t);
		
		extent.flush();
		
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}

}
