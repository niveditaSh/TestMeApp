package Register;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class user_reg {
	WebDriver driver;
	@Given("Navigate to register page")
	public void navigate_to_register_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver(); 
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("user clicks on signup")
	public void signup() {
		new Object(driver).signup.click();
	}
	
	@And("user enters usrname {string}")
	public void username(String username) {
		new Object(driver).username.sendKeys(username);		
	}
	
	@And("user enters fname {string}")
	public void firstname(String firstname ) {
		new Object(driver).firstname.sendKeys(firstname);
	}
	
	@And("user enters lname {string}")
	public void lastname(String lastname ) {
		new Object(driver).lastname.sendKeys(lastname);
	}
	
	@And("user enters pwd {string}")
	public void password(String password ) {
		new Object(driver).password.sendKeys(password);
	}
	
	@And("user enters cnfpwd {string}")
	public void confirmpwd(String confirmpwd) {
		new Object(driver).confirmpwd.sendKeys(confirmpwd);
	}
	
	@And("user selects gender")
	public void gender() {
		new Object(driver).gender.click();
	}
	
	@And("user enters mail {string}")
	public void email(String email) {
		new Object(driver).email.sendKeys(email);		
	}
	
	@And("user enters mbno {string}")
	public void mobileno(String mobileno) {
		new Object(driver).mobileno.sendKeys(mobileno);		
	}
	
	@And("user enters dt {string}")
	public void date(String date) {
		new Object(driver).date.sendKeys(date);		
	}
	
	@And("user enters addr {string}")
	public void address(String address) {
		new Object(driver).address.sendKeys(address);		
	}
	
	@And("user selects a security question")
	public void securityques() {
		new Object(driver).securityques.click();		
	}
	
	@And("user enters ans {string}")
	public void answer(String answer) {
		new Object(driver).answer.sendKeys(answer);;		
	}
	
	@Then("user clicks on register")
	public void register() {
		new Object(driver).register.click();
	}
	
	
	@When("User enters usrnm for login {string}")
	public void logincred(String logincred) {
		new Object(driver).logincred.sendKeys();
	}
	
	@When("User enters password {string}")
	public void pss(String pss) {
		new Object(driver).pss.click();
	}
}
