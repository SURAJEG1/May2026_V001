package may17_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DynamicSearchAndListDropdown {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void dynamicSearch_Example1() 
	{
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchBox.sendKeys("shirt");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//ul[@class='desktop-group']/li"));
		System.out.println(dynamicList.size());
		
		for(int i=0; i<dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			
			if(dynamicList.get(i).getText().contains("For Women")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	
	@Test
	public void dynamicSearch_Example2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchBox.sendKeys("shirt");
		
		List<WebElement> dynamicList =driver.findElements(By.xpath("//ul[@class='desktop-group']/li"));
		Thread.sleep(1000);
		int count = dynamicList.size();
		System.out.println(count);
		
		dynamicList.get(4).click();
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
