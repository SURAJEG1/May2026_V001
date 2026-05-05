package may04_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	//create object of WebDriver interface
	WebDriver driver;
	
	//constructor
	public PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (name = "") WebElement name;
	@FindBy (id = "") WebElement id;
	@FindBy (className = "") WebElement classname;
	@FindBy (linkText = "") WebElement linktext;
	@FindBy (partialLinkText = "") WebElement partiallinktext;
	@FindBy (tagName = "") WebElement tagName;
	@FindBy (css = "") WebElement css;
	@FindBy (xpath = "") WebElement xpath;
	
	
	public void name () 
	{
		name.sendKeys("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
