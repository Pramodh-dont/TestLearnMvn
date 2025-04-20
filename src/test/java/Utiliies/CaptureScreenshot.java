package Utiliies;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v133.css.CSS.TakeCoverageDeltaResponse;

import Testlearn.ReportTestCase;
import Testlearn.Testdatafrmexceldata;

public class CaptureScreenshot {
	public static String CaptureScreenshotapp() throws IOException {
		TakesScreenshot SCST = (TakesScreenshot) ReportTestCase.driver;
		File file = SCST.getScreenshotAs(OutputType.FILE);
		byte[] filecon = null;
		filecon = FileUtils.readFileToByteArray(file);
		String str = Base64.getEncoder().encodeToString(filecon);
		return str;
	}
	
}
