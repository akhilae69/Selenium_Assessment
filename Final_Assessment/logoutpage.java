package Orange_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {

	WebDriver driver;
	public logoutpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement dd;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;
	
	public void getDd() {
		dd.click();
	}

	public void getLogoutbtn() {
		logoutbtn.click();
	}
	
	
}
