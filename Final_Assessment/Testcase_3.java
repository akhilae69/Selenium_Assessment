package Final_Assessmnet;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
  Run|Debug
	public void demo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");
		WebElement laptopCharger = driver.findElement(By.id("dragElement1"));
		Thread.sleep(1000);
		WebElement MobileCover = driver.findElement(By.id("dragElement2"));
		Thread.sleep(1000);
		WebElement LaptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Thread.sleep(1000);
		WebElement MobileCharger = driver.findElement(By.id("dragElement4"));
		
		WebElement accessories1 = driver.findElement(By.id("dropZone1"));
		Thread.sleep(1000);
		WebElement accessories2 = driver.findElement(By.id("dropZone2"));
		
		Actions a = new Actions(driver);
		
		MobileCharger.click();
		MobileCover.click();
		a.dragAndDrop(MobileCharger,accessories1).perform();
		
		LaptopCover.click();
		laptopCharger.click();
		Thread.sleep(1000);
		a.dragAndDrop(LaptopCover,accessories2).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
