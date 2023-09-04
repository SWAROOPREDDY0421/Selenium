package SDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage2 {
	
	
		
		WebDriver driver;
		
		@FindBy(how = How.LINK_TEXT,using="REGISTER")
		WebElement Reglink;
		
		@FindBy(how = How.NAME,using="firstName")
		WebElement fname;
		
		@FindBy(name="lastName")
		WebElement lname;
		
		@FindBy(name="phone")
		WebElement phonenum;
		
		
		@FindBy(name="userName")
		WebElement email;
		
		@FindBy(name="address1")
		WebElement add1;
		
		@FindBy(name="city")
		WebElement city;
		
		@FindBy(name="state")
		WebElement state;
		

		@FindBy(name="postalCode")
		WebElement postal;
		
		@FindBy(name="country")
		WebElement ucountry;
		
		@FindBy(name="email")
		WebElement useremail;
		
		@FindBy(name="password")
		WebElement userpass;
		
		@FindBy(name="confirmPassword")
		WebElement cinformpass;
		
		@FindBy(name="submit")
		WebElement usersub;

		Registrationpage2(WebDriver d){
//			this.driver=driver;
			driver=d;
			PageFactory.initElements(d, this);
			
			
		}
		
		
		public void clickRegLink() {
			
			
			Reglink.click();
		}
		
		public void setfirstname(String finame) {
			fname.sendKeys(finame);
		}
		
		public void setlastname(String laname) {
			lname.sendKeys(laname);
		}
		
		public void setphonenumber(String phonenumber) {
			phonenum.sendKeys(phonenumber);
		}
		
		public void setemail(String Email) {
			email.sendKeys(Email);
		}
		
		public void setaddress1(String Add1) {
			add1.sendKeys(Add1);
		}
		
		public void setcity(String ocity) {
			city.sendKeys(ocity);
		}
		
		public void setstate(String stat) {
			state.sendKeys(stat);
		}
		
		public void setpostal(String post) {
			postal.sendKeys(post);
		}
		
		public void setcountry(String count) {
			ucountry.sendKeys(count);
		}
		
		public void setusername(String uname) {
			useremail.sendKeys(uname);
		}
		
		public void setpassword(String passw) {
				userpass.sendKeys(passw);
		}
		public void setcirmpassword(String confirmpass) {
			cinformpass.sendKeys(confirmpass);
		}
		public void setloginbtn() {
			usersub.click();
		}
	}



