package may06_TestNG;

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

@Listeners(Listener.class)
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
	public void ifram() 
	{
		driver.switchTo().frame("moneyiframe");
		System.out.println("Switched to Iframe...");
		
		WebElement bse = driver.findElement(By.id("bseindex"));
		System.out.println(bse.getText());
		
		WebElement nse = driver.findElement(By.id("nseindex"));
		System.out.println(nse.getText());
		
		WebElement searchBox = driver.findElement(By.id("query"));
		searchBox.sendKeys("tamilnadu");
		searchBox.sendKeys(Keys.ENTER);
		
		driver.switchTo().defaultContent();
		System.out.println("Switchec to defaultContent...");
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
