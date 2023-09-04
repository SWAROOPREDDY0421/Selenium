package SDET;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {

	@Test
	public void verifyFlightREg() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		Registrationpage RegPage = new Registrationpage(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		RegPage.clickRegLink();
		RegPage.setfirstname("Sai");
		RegPage.setlastname("madhava");
		RegPage.setpassword("9901473024");
		RegPage.setemail("sai@gamil.com");
		RegPage.setaddress1("nizampet");
		RegPage.setcity("Hyderabad");
		RegPage.setstate("Telengana");
		RegPage.setpostal("500090");
		RegPage.setcountry("India");
		RegPage.setusername("Swaroopreddy");
		RegPage.setpassword("raju@123");
		RegPage.setcirmpassword("raju@123");
		RegPage.setloginbtn(); 
		
		
		if(driver.getPageSource().contains("Thank you for registering")) {
			
			System.out.println("Registers sucessfully");
		}
		
		
		
	}
	
	
	
	
	}


