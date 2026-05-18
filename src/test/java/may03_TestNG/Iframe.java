package may03_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class Iframe {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void iframHandle() 
	{
		driver.switchTo().frame("auth-login-ui");
		System.out.println("Switched to iframe....");
		
		WebElement enterPh = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		enterPh.sendKeys("78998090");
		
		WebElement clickOnOTP = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		clickOnOTP.click();
		
		driver.switchTo().defaultContent();
		System.out.println("Switched to defaultContent....");
	}
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
