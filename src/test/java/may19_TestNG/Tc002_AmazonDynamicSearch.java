package may19_TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Tc002_AmazonDynamicSearch extends BaseClass{
	
	
	
	@Test
	public void example2_DynamicSearchAndListDropdown() throws InterruptedException
	{
		driver.get(amazonUrl);
		System.out.println("browser Open...");
		Amazon_PageObject apo = new Amazon_PageObject(driver);
		apo.searchBox("mouse");
		apo.dynamicSearchAndListDropdown_Example2();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
