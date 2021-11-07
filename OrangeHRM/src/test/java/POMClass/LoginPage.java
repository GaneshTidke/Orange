package POMClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy (xpath="//input[@name=\"txtUsername\"]")
	private WebElement username;
	
	@FindBy (xpath="//input[@name=\"txtPassword\"]")
	private WebElement password;
	
	@FindBy (xpath="//input[@type=\"submit\"]")
	private WebElement login ;

	
	public LoginPage (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void Username () {
		
		username.sendKeys("Admin");
	}
	
public void Password () {
		
		password.sendKeys("admin123");
	}

public void Login () {
	
	login.click();
}
}
