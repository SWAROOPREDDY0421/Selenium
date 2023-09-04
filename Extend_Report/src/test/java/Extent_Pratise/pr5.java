package Extent_Pratise;

import java.awt.Desktop;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.observer.entity.MediaEntity;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pr5 {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ExtentReports extent=new ExtentReports();
		File file=new File("reports.html");
		ExtentSparkReporter spark=new ExtentSparkReporter(file);
		extent.attachReporter(spark);
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("Swaroop");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("swaroop123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		String base64code=capturescreenshot();
		String path=capturescreenshot("facebook.jpg");
		
		extent.createTest("Test 1","Screenshot base64")
		.info("This is just Info")
		.addScreenCaptureFromBase64String(base64code);
		
		extent.createTest("Test 2","Screenshot base64 title")
		.assignAuthor("suresh")
		.assignCategory("smaoke")
		.assignDevice("chrome")
		.info("This is just Info")
		.addScreenCaptureFromBase64String(base64code,driver.getTitle());
		
		
		
		extent.createTest("Test 3","Screenshot path")
		.info("This is just Info")
		.addScreenCaptureFromPath(path);
		
		extent.createTest("Test 4","Screenshot Path title")
		.info("This is just Info")
		.addScreenCaptureFromPath(path,driver.getTitle());
		
		//mutlipe screenshot
		extent.createTest("Test 5","Screenshot base64 title")
		.info("This is just Info")
		.addScreenCaptureFromBase64String(base64code,driver.getTitle())
		.addScreenCaptureFromBase64String(base64code,driver.getTitle())
		.addScreenCaptureFromBase64String(base64code,driver.getTitle())
		.addScreenCaptureFromBase64String(base64code,driver.getTitle())
		.addScreenCaptureFromBase64String(base64code,driver.getTitle())
		.addScreenCaptureFromBase64String(base64code,driver.getTitle());
		
		extent.createTest("Test 6","Screenshot Path title")
		.info("This is just Info")
		.addScreenCaptureFromPath(path,driver.getTitle())
		.addScreenCaptureFromPath(path,driver.getTitle())
		.addScreenCaptureFromPath(path,driver.getTitle())
		.addScreenCaptureFromPath(path,driver.getTitle())
		.addScreenCaptureFromPath(path,driver.getTitle());
		
		//Log level
		extent.createTest("Test 7","Screenshot base64code title log level")
		.info("This is just Info")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64code).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64code, driver.getTitle()).build());
		
		extent.createTest("Test 8","Screenshot path title log level")
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path, driver.getTitle()).build());
		
		extent.createTest("Test 9","Screenshot path title log level ")
		.fail("this is my ifo", MediaEntityBuilder.createScreenCaptureFromBase64String(base64code, driver.getTitle()).build())
		.fail("info inpath", MediaEntityBuilder.createScreenCaptureFromPath(path, driver.getCurrentUrl()).build());
		
		extent.createTest("Test 9","Screenshot path title log level ")
		.fail("this is fail info", MediaEntityBuilder.createScreenCaptureFromBase64String(base64code).build())
		.fail("this is path ", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		  
		Throwable t =new Throwable("This is throable");
		extent.createTest("Test 10","Screenshot path title log level ")
		.fail(t, MediaEntityBuilder.createScreenCaptureFromBase64String(base64code).build())
		.fail(t, MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		extent.createTest("Test 11","Screenshot path title log level ")
		.fail(t, MediaEntityBuilder.createScreenCaptureFromBase64String(base64code, driver.getCurrentUrl()).build())
		.fail(t, MediaEntityBuilder.createScreenCaptureFromPath(path, driver.getPageSource()).build());
		
		extent.flush();
		driver.quit();
		Desktop.getDesktop().browse(new File("reports.html").toURI());
		
	}
	
	public  static  String capturescreenshot() {
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		String base64code=takescreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot Saved Successfully");
		return base64code;
	}
		public  static  String capturescreenshot(String filename) {
		// TODO Auto-generated method stub
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		File src=takescreenshot.getScreenshotAs(OutputType.FILE);
		File des=new File("./Screen/img1.jpg" +filename );
		try {
			FileUtils.copyFile(src, des);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot Saved Successfully");
		return des.getAbsolutePath();
	}

}
