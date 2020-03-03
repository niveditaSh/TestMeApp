package search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchpro {
	WebDriver driver;
	@Given("navigate to signin page1")
	public void navigate_to_signin_page1() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("user clicks on signin11")
	public void signin1() {
		new searchobj(driver).signin1.click();
	}

	@And("User enters Username1 {string}")
	public void usrnm123(String usrnm123) {
		new searchobj(driver).usrnm123.sendKeys(usrnm123);
	}

	@And("User enters Password1 {string}")
	public void pwd123(String pwd123) {
		new searchobj(driver).pwd123.sendKeys(pwd123);
	}

	@And("User clicks on Login1")
	public void loginn1() {
		new searchobj(driver).loginn1.click();
	}

	@When("User clicks on search product textbox1 {string}")
	public void search111(String search111) {
		new searchobj(driver).search111.sendKeys(search111);
	}

	@Then("User clicks on search button12")
	public void find() {
		new searchobj(driver).find.click();

	}
}

//	@And("User adds the product to cart")
//	public void addtocart() {
//		new searchobj(driver).addtocart.click();
//	}
//
//	@And("User clicks on cart")
//	public void cart() {
//		new searchobj(driver).cart.click();
//	}
//
//	@And("User clicks on checkout")
//	public void checkout() {
//		new searchobj(driver).checkout.click();
//	}
