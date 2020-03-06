package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchobj {
	

	WebDriver driver;
	public searchobj(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'SignIn')]")
	public WebElement signin1;

	@FindBy(id="userName")
	public WebElement usrnm123;

	@FindBy(id="password")
	public WebElement pwd123;

	@FindBy(xpath="//input[@name='Login']")
	public WebElement loginn1;
	
	@FindBy(xpath="//input[@id='myInput']")
	public WebElement search111;

//	@FindBy(xpath="//form//input[@name='val']")
//	public WebElement find;
//	
//	@FindBy(xpath="//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9']/div[1]")
//	public static WebElement image;
//
//	@FindBy(xpath="//a[contains(text(),'Cart')]")
//	public static WebElement addtocart;

//	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[1]//div[2]//center[1]//a[1]")
//	public WebElement addtocart;
//
//	@FindBy(xpath="//a[contains(text(),'Cart')]")
//	public WebElement cart;
//
//	@FindBy(xpath="//a[@class='btn btn-success btn-block']")
//	public WebElement checkout;
//	
	
	
	

	
	
	
	
	
}	



