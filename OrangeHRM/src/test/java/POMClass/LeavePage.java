package POMClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeavePage {
	
	@FindBy (xpath="//select[@name=\"leaveList[cmbSubunit]\"]")	
      private WebElement SubUnit;
	
	public LeavePage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void subunit() {
		
		SubUnit.click();
		Select s = new Select (SubUnit);
		s.selectByVisibleText("Engineering");
		
	}
	

}
