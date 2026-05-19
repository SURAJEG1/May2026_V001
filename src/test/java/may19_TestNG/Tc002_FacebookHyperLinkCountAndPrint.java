package may19_TestNG;

import org.testng.annotations.Test;

public class Tc002_FacebookHyperLinkCountAndPrint extends BaseClass{
	
	
	@Test
	public void facebookHyperLink() 
	{
		driver.get(faceboolUrl);
		Facebook_PageObject fb = new Facebook_PageObject(driver);
		fb.facebookLoginPageHyperLinkCountAndPrint();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
