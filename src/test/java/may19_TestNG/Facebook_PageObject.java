package may19_TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_PageObject extends ReusableMethods{

	WebDriver driver;
	//constructor
	public Facebook_PageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (tagName = "a") List<WebElement> hyperLink;
	@FindBy (linkText = "Instagram") WebElement instagram;
	
	
	
	public void MouseHoverRightClickActionOnInstagramLink() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.moveToElement(instagram).contextClick().build().perform();
		threadWait(1000);
	}
	
	
	public void robotClassKeyBoardActons() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	
	public void getWindowHandles() 
	{
		windowHandles();
	}
	
	
	public void facebookLoginPageHyperLinkCountAndPrint() 
	{
		int count = hyperLink.size();
		System.out.println(count);
		for(WebElement element : hyperLink) 
		{
			System.out.println(element.getText());
		}
	}
	
	
	
	
	
	public void hyperLinkDynamicListClick(String link) throws InterruptedException 
	{
		System.out.println(hyperLink.size());
		threadWait(1000);
		for(int i=0; i<hyperLink.size(); i++) 
		{
			System.out.println(hyperLink.get(i).getText());
			if(hyperLink.get(i).getText().contains(link)) 
			{
				hyperLink.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
