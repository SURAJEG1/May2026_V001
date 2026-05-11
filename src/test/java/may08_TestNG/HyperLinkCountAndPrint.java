package may08_TestNG;

import java.time.Duration;
import java.util.List;

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
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void hyperLinkPrintAndCount() throws InterruptedException 
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		Thread.sleep(1000);
		System.out.println(count);
		for(WebElement element:links) 
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
