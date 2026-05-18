package may17_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void iframe() throws InterruptedException 
	{
		driver.switchTo().frame("moneyiframe");
		System.out.println("switched to iframe...");
		
		WebElement bse = driver.findElement(By.id("bseindex"));
		WebElement nse = driver.findElement(By.id("nseindex"));
		WebElement searchBox = driver.findElement(By.id("query"));
		
		System.out.println(bse.getText());
		System.out.println(nse.getText());
		searchBox.sendKeys("hourmos");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		         String parent = it.next();
		         String child = it.next();
		         
		         driver.switchTo().window(parent);
		         System.out.println(driver.getTitle());
		         driver.switchTo().window(child);
		         System.out.println(driver.getTitle());
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
