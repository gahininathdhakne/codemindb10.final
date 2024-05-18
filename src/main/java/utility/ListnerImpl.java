package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImpl implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Test case started "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case success "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case Failed "+result.getName()); 	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
	}
}

