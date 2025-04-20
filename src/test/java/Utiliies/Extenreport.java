package Utiliies;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Testlearn.Reportgen;

public class Extenreport {
	public static ExtentReports report;
	public static ExtentTest test;

	public static void setup() {
		report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("reports1/report1.html");
		report.attachReporter(spark);
	}

	public static void createTC(String testcasename) {
		test = report.createTest(testcasename);
	}

	public static void addsteps(String msg) throws IOException {
		test.info(msg, MediaEntityBuilder.createScreenCaptureFromBase64String(CaptureScreenshot.CaptureScreenshotapp()).build());
	}

	public static void flushreport() {
		report.flush();
	}
}