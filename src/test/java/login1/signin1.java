package login1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class signin1 {
	WebDriver driver;
	@Given("navigate to signin page")
	public void  navigate_to_signin_page() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("user clicks on signin")
	public void signin() {
		new signinobject(driver).signin.click();
	}
	
	@And("User enters Username {string}")
	public void usrnm(String usrnm) {
		new signinobject(driver).usrnm.sendKeys(usrnm);
	}
	
	@And("User enters Password {string}")
	public void pwd1(String pwd1) {
		new signinobject(driver).pwd1.sendKeys(pwd1);
	}
	
	@And("User clicks on Login")
	public void loginn() {
		new signinobject(driver).loginn.click();
	}
}
