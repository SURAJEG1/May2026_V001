package may10_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {

	//create object of WebDriver interface
	WebDriver driver;
	
	//constructor
	public PageObjectClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (name = "") WebElement name;
	@FindBy (className = "") WebElement className;
	@FindBy (id = "") WebElement Id;
	@FindBy (linkText = "") WebElement linktext;
	@FindBy (partialLinkText = "") WebElement partieallinktext;
	@FindBy (tagName = "") WebElement tagname;
	@FindBy (css = "") WebElement css;
	@FindBy (xpath = "") WebElement xpath;
	
	
	public void nameLocater() 
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
