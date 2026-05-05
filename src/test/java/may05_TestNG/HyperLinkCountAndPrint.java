package may05_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HyperLinkCountAndPrint {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void hyperLinkCountAndPrint() throws InterruptedException 
	{
		Thread.sleep(7000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		
		Thread.sleep(1000);
		for(WebElement element : links) 
		{
			System.out.println(element.getText());
		}
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
