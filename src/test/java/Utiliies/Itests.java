package Utiliies;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Testlearn.Reportgen;

public class Itests implements ITestListener {

	
	public void onTestStart(ITestResult result) {
//		System.out.println(result.getMethod().getMethodName());
		Extenreport.createTC(result.getMethod().getMethodName());
		System.out.println(result.getMethod().getMethodName());
	}
	
	
	public void onFinish(ITestContext context) {
//		System.out.println(context.getName()); 
		Extenreport.flushreport();
	}
}
