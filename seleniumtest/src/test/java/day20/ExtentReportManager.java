package day20;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener 
{
	public ExtentSparkReporter sparkReporter;  //UI of the report
	public ExtentReports extent;            // populate common info of the report
	public ExtentTest test;   // creating test case entries in the report and update status of the test method
	
	public void onStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "local host");
		extent.setSystemInfo("Tester Name", "Faiz");
		extent.setSystemInfo("Envirnoment Name", "QA");
		extent.setSystemInfo("Os", "Window10");
		extent.setSystemInfo("Browser name", "Chrome");	
		
	}
	
	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case passed is:" + result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case failed is:" + result.getName());
		test.log(Status.FAIL, "Test case failed caused is:" + result.getThrowable());
		
	}
	
    public void onTestSkipped(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Skipped is:" + result.getName());
		
	}
    
    public void onFinish(ITestResult result){
    	
    	extent.flush();
    }
}

