package Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Object {
	WebDriver driver;
	public Object(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'SignUp')]")
	public WebElement signup;
	
	@FindBy(id="userName")
	public WebElement username;
	
	@FindBy(id="firstName")
	public WebElement firstname;
	
	@FindBy(id="lastName")
	public WebElement lastname;
	
	@FindBy(id="password")
	public WebElement password;

	@FindBy(id="pass_confirmation")
	public WebElement confirmpwd;

	@FindBy(xpath="//*[@id='gender'][@value='Female']")
	public WebElement gender;

	@FindBy(id="emailAddress")
	public WebElement email;

	@FindBy(id="mobileNumber")
	public WebElement mobileno;

	@FindBy(name="dob")
	public WebElement date;

	@FindBy(id="address")
	public WebElement address;

	@FindBy(name="securityQuestion")
	public WebElement securityques;

	@FindBy(id="answer")
	public WebElement answer;

	@FindBy(xpath="//input[@name='Submit']")
	public WebElement register;

	@FindBy(id="userName")
	public WebElement logincred;

	@FindBy(id="password")
	public WebElement pss;
	
	
}
