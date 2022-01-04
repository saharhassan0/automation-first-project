package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;


public class firstclass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/ncr");
		Thread.sleep(2000);
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium WebDriver");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);	
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue(bodyText.contains("Selenium - Web Browser Automation"));
		driver.quit();
	}
}	
	