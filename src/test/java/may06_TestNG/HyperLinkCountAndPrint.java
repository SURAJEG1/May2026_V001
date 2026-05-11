package may06_TestNG;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class HyperLinkCountAndPrint {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void hyperLink() throws InterruptedException 
	{
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int count = list.size();
		System.out.println(count);
		
		Thread.sleep(1000);
		for(WebElement element:list) 
		{
			System.out.println(element.getText());
		}
		
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
