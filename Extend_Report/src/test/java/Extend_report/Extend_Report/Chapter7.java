package Extend_report.Extend_Report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chapter7 {
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ExtentReports extent = new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\SWAROOP REDDY\\eclipse-workspace\\Selenium_Practise\\Extend_Report\\Reports\\sample.html");
		extent.attachReporter(spark);
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String Base64code=capturescreenshot();
		String path=capturescreenshot("Google.jpg");
		
		//Test level
		extent
		.createTest("ScreenShot Test 1","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.addScreenCaptureFromBase64String(Base64code);
		
		extent
		.createTest("ScreenShot Test 2","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.addScreenCaptureFromBase64String(Base64code,"Google homepage1")
		.addScreenCaptureFromBase64String(Base64code,"Google homepage2")
		.addScreenCaptureFromBase64String(Base64code,"Google homepage3");
		
		extent
		.createTest("ScreenShot Test 3","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.addScreenCaptureFromPath(path);
		
		extent
		.createTest("ScreenShot Test 4","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.addScreenCaptureFromPath(path, "Google homepage1")
		.addScreenCaptureFromPath(path, "Google homepage2")
		.addScreenCaptureFromPath(path, "Google homepage3");
		
		extent
		.createTest("ScreenShot Test 5","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(Base64code).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		extent
		.createTest("ScreenShot Test 6","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(Base64code, "Google homepage7").build())
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path, "Google homepage8").build());
		
		extent
		.createTest("ScreenShot Test 7","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.fail("This is media1",MediaEntityBuilder.createScreenCaptureFromBase64String(Base64code).build())
		.fail("This is media2",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		extent
		.createTest("ScreenShot Test 8","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.fail("This is media3",MediaEntityBuilder.createScreenCaptureFromBase64String(Base64code, "Google homepage7").build())
		.fail("This is media4",MediaEntityBuilder.createScreenCaptureFromPath(path, "Google homepage8").build());
		
		
		Throwable t=new Throwable("This is throwable");
		extent
		.createTest("ScreenShot Test 9","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.fail(t,MediaEntityBuilder.createScreenCaptureFromBase64String(Base64code).build())
		.fail(t,MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		extent
		.createTest("ScreenShot Test 10","This is for Attaching Screenshot to the test at Test level")
		.info("This is info msg")
		.fail(t,MediaEntityBuilder.createScreenCaptureFromBase64String(Base64code, "Google homepage7").build())
		.fail(t,MediaEntityBuilder.createScreenCaptureFromPath(path, "Google homepage8").build());
		
		extent.flush();
		driver.quit();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}
	
	
	public static  String capturescreenshot() {
		TakesScreenshot takesscreenshot=(TakesScreenshot)driver;
		String Base64code=takesscreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot  saved Successfully");
		return Base64code;
	
		
	}
	public static  String capturescreenshot(String filename) {
		TakesScreenshot takesscreenshot=(TakesScreenshot)driver;
		File src=takesscreenshot.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/"+filename);
		try {
			FileUtils.copyFile(src, des);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot  saved Successfully");
		return des.getAbsolutePath();
	}

}
