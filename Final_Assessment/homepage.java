package Orange_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement RecruitmentLink;
	
	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement infoLink;
	
	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement buzzlink;

	public void getRecruitmentLink() {
		RecruitmentLink.click();
	}
	
	public void getInfoLink() {
		infoLink.click();
	}
	
	public void getBuzzlink() {
		buzzlink.click();
	}
}
