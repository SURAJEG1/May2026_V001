package may06_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ClickOnSelectHyperLink {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void hyperLinkPrintAndClickOnSelectLink() 
	{
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		for(WebElement element : linkList) 
		{
			System.out.println(element.getText());
		}
		
		for(int i=0; i<=linkList.size(); i++) 
		{
			System.out.println(linkList.get(i).getText());
			if(linkList.get(i).getText().contains("Instagram")) 
			{
				linkList.get(i).click();
				break;
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
