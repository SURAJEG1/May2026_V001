package may19_TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class Tc003_HyperLinkDynamicListClick extends BaseClass{
	
	
	@Test
	public void facebookHyperLinksPrintAndDynamicClick() throws InterruptedException 
	{
		driver.get(faceboolUrl);
		Facebook_PageObject fb = new Facebook_PageObject(driver);
		fb.hyperLinkDynamicListClick("Instagram");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
