package SDET;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rgitest {

public void verifyFlightREg() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		Registrationpage2 REGpage = new Registrationpage2(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		
		REGpage.clickRegLink();
		REGpage.setfirstname("Sai");
		REGpage.setlastname("madhava");
		REGpage.setpassword("9901473024");
		REGpage.setemail("sai@gamil.com");
		REGpage.setaddress1("nizampet");
		REGpage.setcity("Hyderabad");
		REGpage.setstate("Telengana");
		REGpage.setpostal("500090");
		REGpage.setcountry("India");
		REGpage.setusername("Swaroopreddy");
		REGpage.setpassword("raju@123");
		REGpage.setcirmpassword("raju@123");
		REGpage.setloginbtn(); 
		
		
		if(driver.getPageSource().contains("Thank you for registering")) {
			
			System.out.println("Registers sucessfully");
		}
		
		
		
	}
	
	
	
	
}
