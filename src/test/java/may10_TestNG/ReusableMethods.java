package may10_TestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	WebDriver driver;
	
	//constructor
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void maximized() 
	{
		driver.manage().window().maximize();
	}
	
	public void impWait() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void pageScrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void closeTab() 
	{
		driver.close();
	}
	
	
	public void quitBrowser() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
