package may27_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethod {
	
	//create object of WebDriver interface
	WebDriver driver;
	//parameterize constructor
	public ReusableMethod(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void maximize() 
	{
		driver.manage().window().maximize();
	}
	
	public void impWait(int wait) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	public void pageScrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String>  it = wd.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	
	public void closeWindow() 
	{
		driver.close();
	}
	
	public void quitWindow() 
	{
		driver.quit();
	}
	
	public void refreshWindow() 
	{
		driver.navigate().refresh();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
