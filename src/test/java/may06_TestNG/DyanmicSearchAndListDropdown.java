package may06_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class DyanmicSearchAndListDropdown {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void dynamicSearchAndDropdownListClick() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("sound");
		
		Thread.sleep(1000);
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(dynamicList.size());
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			
			if(dynamicList.get(i).getText().contains("bar for smart tv")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
		
	}
	
	
	
	@Test
	public void dynamicSearchAndDropdownClickByIndexing() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("sound");
		
		Thread.sleep(1000);
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		Thread.sleep(1000);
		int count = dynamicList.size();
		System.out.println(count);
		dynamicList.get(3).click();
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
