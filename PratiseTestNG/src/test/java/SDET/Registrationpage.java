package SDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Registrationpage {
	
	WebDriver driver;
	
//	@FindBy(linkText="REGISTER")
//	WebElement Reglink;
	
	By Registerlink=By.linkText("REGISTER");
	By firstname=By.name("firstName");
	By lastname=By.name("lastName");
	By phonenumber=By.name("phone");
	By email=By.name("userName");
	By address1=By.name("address1");
	By city=By.name("city");
	By state=By.name("state");
	By postal=By.name("postalCode");
	By country=By.name("country");
	By username=By.name("email");
	By paasword=By.name("password");
	By conformpass=By.name("confirmPassword");
	By login=By.name("submit");
	
	
	Registrationpage(WebDriver d){
//		this.driver=driver;
		driver=d;
		
		
	}
	
	
	public void clickRegLink() {
		
		
		driver.findElement(Registerlink).click();
	}
	
	public void setfirstname(String fname) {
		driver.findElement(firstname).sendKeys(fname);
	}
	
	public void setlastname(String lname) {
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void setphonenumber(String phonenum) {
		driver.findElement(phonenumber).sendKeys(phonenum);
	}
	
	public void setemail(String Email) {
		driver.findElement(email).sendKeys(Email);
	}
	
	public void setaddress1(String Add1) {
		driver.findElement(address1).sendKeys(Add1);
	}
	
	public void setcity(String ocity) {
		driver.findElement(city).sendKeys(ocity);
	}
	
	public void setstate(String stat) {
		driver.findElement(state).sendKeys(stat);
	}
	
	public void setpostal(String post) {
		driver.findElement(postal).sendKeys(post);
	}
	
	public void setcountry(String count) {
		driver.findElement(country).sendKeys(count);
	}
	
	public void setusername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void setpassword(String passw) {
		driver.findElement(paasword).sendKeys(passw);
	}
	public void setcirmpassword(String confirmpass) {
		driver.findElement(conformpass).sendKeys(confirmpass);
	}
	public void setloginbtn() {
		driver.findElement(login).click();
	}
}
