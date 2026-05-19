package may19_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	String browser = readconfig.getBrowser();
	String amazonUrl = readconfig.getAmazonUrl();
	String faceboolUrl = readconfig.getFacebookUrl();
	
	
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		switch(browser.toLowerCase()) 
		{
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--incognito");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			
		default:
			driver = null;
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
