package may21_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;

public class HyperLinkCountAndPrint {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void getPrintAndCountFacebookLoginPageHyperLink() 
	{
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		int count = linkList.size();
		System.out.println(count);
		
		for(WebElement element:linkList) 
		{
			System.out.println(element.getText());
		}
	}
	
	
	@Test
	public void getClickOnInstagramHyperLink() throws InterruptedException 
	{
		List<WebElement> hyperLink = driver.findElements(By.tagName("a"));
		int count = hyperLink.size();
		System.out.println(count);
		
		Thread.sleep(1000);
		for(int i=0; i<=hyperLink.size(); i++) 
		{
			System.out.println(hyperLink.get(i).getText());
			
			if(hyperLink.get(i).getText().contains("Instagram")) 
			{
				hyperLink.get(i).click();
				break;
			}
		}
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
