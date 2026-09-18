package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_checkoutCompletePage {

	WebDriver driver;

	public Sauce_checkoutCompletePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	private WebElement message;
	
	public String getMessage() {
		return message.getText();
	}	
	
}
Footer
