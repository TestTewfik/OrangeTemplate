/*package listenners;

import java.io.IOException;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;
import utilitaires.TestUtil;

public class TestngListeners extends TestBase implements ITestListener, IInvokedMethodListener {
	String directoryScreenshots = projectpath + "\\src\\test\\resources\\screenshots";

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			TestUtil.captureScreenShot();
			logger.info("voir capture d'ecran à :" + directoryScreenshots);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		

	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		

	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		

	}

}*/
