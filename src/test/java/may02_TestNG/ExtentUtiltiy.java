package may02_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentUtiltiy {
	
	//create static object of ExtentReports class
	public static ExtentReports report;
	
	public ExtentReports getExtentReport() 
	{
		if(report == null) 
		{
			String filepath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File extentFolder = new File(System.getProperty("user.dir") + "/reports");
			
			if(!extentFolder.exists()) 
			{
				extentFolder.mkdirs();
			}
			
			
			ExtentSparkReporter spark = new ExtentSparkReporter(filepath);
			spark.config().setReportName("Automation Test Report");
			spark.config().setDocumentTitle("Extent Report");
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setTimeStampFormat("");
			
			
			
			report = new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("Tester", "Suraj");
			report.setSystemInfo("Os", "Windows11);");
			report.setSystemInfo("Browser", "Chrome");
			report.setSystemInfo("Machine", "Tester_Laptop");
		}
		
		return report;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
