package may22_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Iframe {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void iframeHandles() 
	{
		driver.switchTo().frame("auth-login-ui");
		System.out.println("switched to ifram....");
		
		WebElement enterPno = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		enterPno.sendKeys("4778992003");
		
		WebElement clickOnOtp = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-2 ilXTK']"));
		clickOnOtp.click();
		
		driver.switchTo().defaultContent();
		System.out.println("switched to default....");
	}
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
