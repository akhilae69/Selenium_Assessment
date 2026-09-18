package BaseClassImplementation;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import pomUtilities.Sauce_CartPage;
import pomUtilities.Sauce_CheckoutOverviewPage;
import pomUtilities.Sauce_CheckoutPage;
import pomUtilities.Sauce_HomePage;
import pomUtilities.Sauce_LoginPage;
import pomUtilities.Sauce_checkoutCompletePage;

public class Sauce_baseImplementation extends Sauce_baseClass {

	@Test(priority = 1)
	public void LoginTest() throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("./src/test/resources/DDT/commondata.properties");
		Properties p = new Properties();
		p.load(file);
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		Sauce_LoginPage l = new Sauce_LoginPage(d);
		l.getUsername(un);
		l.getPassword(pw);
		Thread.sleep(2000);
		l.getLogin();
	}
	
	@Test(priority = 2)
	public void oderPalcementTest() throws InterruptedException, IOException {
		
		Sauce_HomePage h = new Sauce_HomePage(d);
		if(h.getProduct().equals("Products"))
			System.out.println("Product page is displayed");
		else
			System.out.println("Not displayed");
		Thread.sleep(2000);
		
		h.getAddtocart();
		Thread.sleep(2000);
		
		if(h.getquantity().equals("1"))
			System.out.println("Only one product is added");
		else 
			System.out.println("many product are added");
	
		h.getCart();
		
		Sauce_CartPage ca = new Sauce_CartPage(d);
		
		
		if(ca.getProductverify().equals("Sauce Labs Backpack"))
			System.out.println("BackPack product is added");
		else
			System.out.println("Wrong product is added");
		Thread.sleep(2000);
		
		ca.getCheckout();
		Thread.sleep(2000);
		
		Sauce_CheckoutPage co = new Sauce_CheckoutPage(d);
		FileInputStream f = new FileInputStream("./src/test/resources/DDT/saucedemo_data.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet sh = w.getSheet("sheet1");
		Row row = sh.getRow(1);
		
		String fn = row.getCell(0).getStringCellValue();
		String ln = row.getCell(1).getStringCellValue();
		String c = row.getCell(2).getStringCellValue();
		
		co.getFName(fn);
		co.getLName(ln);
		co.getCode(c);
		Thread.sleep(2000);
		
		co.getContinuebtn();
		
		Sauce_CheckoutOverviewPage o = new Sauce_CheckoutOverviewPage(d);
		if(o.getOverview().equals("Checkout: Overview"))
			System.out.println("product overview is displayed");
		else
			System.out.println("product overview is not displayed");
		
		o.getFinish();
		Thread.sleep(2000);
		
		Sauce_checkoutCompletePage a = new Sauce_checkoutCompletePage(d);
		if(a.getMessage().equals("Thank you for your order!"))
			System.out.println("message is dispalyed");
		else 
			System.out.println("message is not displayed");
	}
}
