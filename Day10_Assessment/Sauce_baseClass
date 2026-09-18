package BaseClassImplementation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sauce_baseClass {

	public WebDriver d;
	@BeforeSuite
	public void bs() {
		System.out.println("open Database connectivity");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("close Database connectivity");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("PreCondition");
	}
	
	@AfterTest
	public void at() {
		System.out.println("PostCondition");
	}
	
	@BeforeClass
	public void bc() throws IOException, InterruptedException {
		System.out.println("Open the browser");
		FileInputStream file = new FileInputStream("./src/test/resources/DDT/commondata.properties");
		Properties p = new Properties();
		p.load(file);
		String browser = p.getProperty("browser");
		String Url = p.getProperty("url");
		
		if(browser.equals("chrome"))
			d = new ChromeDriver();
		if(browser.equals("edge"))
			d = new EdgeDriver();
		if(browser.equals("firefox"))
			d = new FirefoxDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get(Url);
	}
	
	@AfterClass
	public void ac() {
		System.out.println("close the browser");
		d.quit();

	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Login");	
	}
	
	@AfterMethod
	public void am() {
		System.out.println("Logout");
	}
}
