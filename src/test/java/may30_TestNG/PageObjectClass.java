package may30_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	
	//create object of WebDriver interface
	WebDriver driver;
	
	//parameterize constructor
	public PageObjectClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (id = "") WebElement id;
	@FindBy (name = "") WebElement name;
	@FindBy (className = "") WebElement classname;
	@FindBy (linkText = "") WebElement linktext;
	@FindBy (partialLinkText = "") WebElement partiallinktext;
	@FindBy (tagName = "") WebElement tagname;
	@FindBy (css = "") WebElement css;
	@FindBy (xpath = "") WebElement xpath;
	
	
	
	public void dologin() 
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
