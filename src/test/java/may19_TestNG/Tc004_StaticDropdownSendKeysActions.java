package may19_TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class Tc004_StaticDropdownSendKeysActions extends BaseClass{
	
	
	@Test
	public void staticDropdown_Example3()
	{
		driver.get(amazonUrl);
		System.out.println("browser and Url open...");
		
		Amazon_PageObject dropdown = new Amazon_PageObject(driver);
		dropdown.dropdownSelectBySendKeysAction();
		driver.close();
	}
	

}
