package may09_TestNG;

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
	public void  setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void dynamicSearchAndDropdown_Example1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("speaker");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		int count = dynamicList.size();
		System.out.println(count);
		
		Thread.sleep(1000);
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains("for tv"))
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	@Test
	public void dynamicSearchAndDropdown_Example2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("speaker");
		
		Thread.sleep(1000);
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		Thread.sleep(1000);
		int count = dynamicList.size();
		System.out.println(count);
		dynamicList.get(5).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
