package may02_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataDrivenWithDataProviderAnnotation {

	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "dredential")
	public void login(String un, String pwd) 
	{
		WebElement enterUsername = driver.findElement(By.xpath(""));
		WebElement entetPass = driver.findElement(By.xpath(""));
		WebElement clickOnLoginBtn = driver.findElement(By.xpath(""));
		
		enterUsername.sendKeys(un);
		entetPass.sendKeys(pwd);
		clickOnLoginBtn.click();
	}
	
	
	@DataProvider(name = "dredential")
	public Object[][] dataDriven()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "admin";
		data[1][1] = "admin123";
		
		return data;
	}
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
