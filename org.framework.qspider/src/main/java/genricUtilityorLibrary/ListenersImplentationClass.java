package genricUtilityorLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplentationClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+" execution SuccessFull!!");
	}

	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		TakesScreenshot ts= (TakesScreenshot)BaseClass.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenShots\\"+methodname+".png");
		
		try {
			Files.copy(src, dest);
		}
		catch(IOException e) {
			
		}
	}

	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		Reporter.log(methodname+" execution skips!!");
		
	}	
	
}
