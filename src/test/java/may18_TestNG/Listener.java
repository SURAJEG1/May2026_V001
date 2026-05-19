package may18_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "successfully executed...");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "got failed & screenshot captured...");
		System.out.println(result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + "Test case stated...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
