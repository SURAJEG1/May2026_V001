package may19_TestNG;

import java.awt.AWTException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Tc001_FacebookMouseHoverAndRobotClassKeyboardAction extends BaseClass{
	
	
	@Test(priority=1)
	public void mouseHoverAndKeyboardAction() throws AWTException, InterruptedException 
	{
		driver.get(faceboolUrl);
		Facebook_PageObject fb = new Facebook_PageObject(driver);
		fb.MouseHoverRightClickActionOnInstagramLink();
		fb.robotClassKeyBoardActons();
		fb.threadWait(2000);
		fb.windowHandles();
	}
	
	
	
	
	
	
	
	
	
	

}
