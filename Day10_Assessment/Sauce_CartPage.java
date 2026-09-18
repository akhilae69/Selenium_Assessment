package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_CartPage {

	WebDriver driver;
	
	public Sauce_CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement productverify;
	
	@FindBy(id="checkout")
	private WebElement checkout;

	public String getProductverify() {
		return productverify.getText();
	}

	public void getCheckout() {
		checkout.click();
	}
	
}
