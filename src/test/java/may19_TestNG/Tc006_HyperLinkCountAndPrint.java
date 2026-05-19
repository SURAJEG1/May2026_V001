package may19_TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Tc006_HyperLinkCountAndPrint extends BaseClass{
	
	@Test
	public void hyperLinkCountAndPrint() throws InterruptedException 
	{
		driver.get(amazonUrl);
		Amazon_PageObject hyperLink = new Amazon_PageObject(driver);
		hyperLink.hyperLinkCountAndPrint();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
