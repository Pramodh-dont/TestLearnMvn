package Testlearn;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utiliies.Extenreport;

public class Reportgen {
	public static ExtentReports report;
	public static ExtentTest test;
	public static WebDriver driver;

	@Test
	public static void logintest() throws IOException {
		Reportgen.setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Reportgen.createTC("longin");
		Reportgen.addsteps("login success");
		Reportgen.flushreport();
		driver.quit();
		
	}
	public static void setup(){
		report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/report.html");
		report.attachReporter(spark);
	}
	public static void createTC(String testcasename) {
		test = report.createTest(testcasename);
	}
	public static void addsteps(String msg) throws IOException {
		test.info(msg,MediaEntityBuilder.createScreenCaptureFromBase64String(Reportgen.CaptureScreenshotapp()).build());
	}
	public static void flushreport() {
		report.flush();
	}
	public static String CaptureScreenshotapp() throws IOException {
		TakesScreenshot SC = (TakesScreenshot) driver;
		File file=SC.getScreenshotAs(OutputType.FILE);
		byte[] filecon = null;
		filecon = FileUtils.readFileToByteArray(file);
		String str= Base64.getEncoder().encodeToString(filecon);
		return str;
		}
}
