package may04_TestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	//create object of WebDriver interface;
	WebDriver driver;
	
	//constructor
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	
	public void max() 
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
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
