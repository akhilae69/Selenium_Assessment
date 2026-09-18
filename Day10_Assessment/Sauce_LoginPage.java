package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_LoginPage {

	WebDriver driver;

	public Sauce_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement login;

	public void getUsername(String value) {
		username.sendKeys(value);
	}

	public void getPassword(String value) {
		password.sendKeys(value);
	}

	public void getLogin() {
		login.click();
	}
		
}
