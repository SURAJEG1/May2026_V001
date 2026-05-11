package may09_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

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
	public void iframe() throws InterruptedException 
	{
		driver.switchTo().frame("auth-login-ui");
		System.out.println("switch to iframe...");
		WebElement enterPhoneNo = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		enterPhoneNo.sendKeys("75757575757");
		WebElement clicOnOTP = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		clicOnOTP.click();
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.switchTo().defaultContent();
		System.out.println("switch to defaultContent...");
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
