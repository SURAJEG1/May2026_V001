package may19_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	WebDriver driver;
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void threadWait(int wait) throws InterruptedException 
	{
		Thread.sleep(wait);
	}
	
	public void maximize() 
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
	
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
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
