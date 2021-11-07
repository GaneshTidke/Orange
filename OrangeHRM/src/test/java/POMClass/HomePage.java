package POMClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="//a[@id=\"menu_pim_viewPimModule\"]")
	private WebElement pim;

	@FindBy (xpath="//a[@id=\"menu_leave_viewLeaveModule\"]")
	private WebElement leave;
	
	@FindBy (xpath="//a[@id=\"menu_time_viewTimeModule\"]")
	private WebElement time;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void PIM() {
		pim.click();
	}
	
	public void Leave() {
		leave.click();
	}
	
	public void Time() {
		time.click();
	}
}
