package Orange_HRM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buzzpage {

	WebDriver driver;
	public Buzzpage(WebDriver d)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//textarea[@class='oxd-buzz-post-input']")
	private WebElement textfield;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement postbtn;
	
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--label-warn orangehrm-post-filters-button']/../..//p[@class='oxd-text oxd-text--p orangehrm-buzz-post-body-text']")
	private WebElement verify;
	
	public void getTextfield() throws IOException {
		//fetching data from excel
		FileInputStream fis = new FileInputStream("./src/test/resources/DDt/OrangeHRM_Recruitment.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet4");
		Row row = sh.getRow(1);	
		String text = row.getCell(0).getStringCellValue();
		textfield.sendKeys(text);
	}
	
	public void getPostbtn() {
		postbtn.click();
	}
	
	public boolean getVerify() {
		return verify.isDisplayed();
	}
}
