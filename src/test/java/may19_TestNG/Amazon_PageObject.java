package may19_TestNG;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_PageObject extends ReusableMethods{
	
	
	
	WebDriver driver;
	public Amazon_PageObject(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "twotabsearchtextbox") WebElement searchBox;
	@FindBy (xpath = "//span[@class='s-heavy']") List<WebElement> dynamicList;
	@FindBy (id = "searchDropdownBox") WebElement dropdown;
	@FindBy (tagName = "a") List<WebElement> hyperLink;
	
	
	
	public void searchBox(String prod) 
	{
		searchBox.sendKeys(prod);
	}
	
	
	public void dynamicSearchAndListDropdown_Example1(String coment) throws InterruptedException 
	{
		System.out.println(dynamicList.size());
		
		threadWait(2000);
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains(coment)) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	public void dynamicSearchAndListDropdown_Example2() throws InterruptedException 
	{
		threadWait(1000);
		int count = dynamicList.size();
		System.out.println(count);
		dynamicList.get(3).click();
	}
	
	
	
	public void dropdownSelectByValue(String value) 
	{
		Select sc = new Select(dropdown);
		sc.selectByValue(value);
	}
	
	public void dropdownSelectByIndex(int val) 
	{
		Select sc = new Select(dropdown);
		sc.selectByIndex(val);
	}
	
	
	public void dropdownSelectBySendKeysAction() 
	{
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
	}
	
	
	
	public void hyperLinkCountAndPrint() throws InterruptedException 
	{
		threadWait(1000);
		int count = hyperLink.size();
		System.out.println(count);
		for(WebElement element : hyperLink) 
		{
			System.out.println(element.getText());
		}
	}
	
	
	
	

}
