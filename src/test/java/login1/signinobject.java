package login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinobject {
WebDriver driver;
public signinobject(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[contains(text(),'SignIn')]")
public WebElement signin;

@FindBy(id="userName")
public WebElement usrnm;

@FindBy(id="password")
public WebElement pwd1;

@FindBy(xpath="//input[@name='Login']")
public WebElement loginn;


}
