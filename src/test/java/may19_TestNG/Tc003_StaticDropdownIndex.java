package may19_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class Tc003_StaticDropdownIndex extends BaseClass{
	
	
	
	@Test
	public void staticDropdown_Example1()
	{
		driver.get(amazonUrl);
		System.out.println("browser and Url open...");
		
		Amazon_PageObject dropdown = new Amazon_PageObject(driver);
		dropdown.dropdownSelectByIndex(4);
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	

}
