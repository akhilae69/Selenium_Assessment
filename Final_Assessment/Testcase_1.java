package Orange_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement UN;
	
	@FindBy(name="password")
	private WebElement PW;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	public void getUN(String value) {
		UN.sendKeys(value);
	}

	public void getPW(String value) {
		PW.sendKeys(value);;
	}

	public void getLoginbtn() {
		loginbtn.click();
	}
	
}
