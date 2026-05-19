package may19_TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Tc001_DynamicSearchAndListDropdown extends BaseClass{
	
	
	@Test
	public void example1_DynamicSearchAndListDropdown() throws InterruptedException
	{
		driver.get(amazonUrl);
		System.out.println("browser Open...");
		Amazon_PageObject apo = new Amazon_PageObject(driver);
		apo.searchBox("mouse");
		apo.dynamicSearchAndListDropdown_Example1("for laptop");
		driver.quit();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
