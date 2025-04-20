package Testlearn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import Utiliies.CaptureScreenshot;
import Utiliies.ExceldatreaderUtils;
import Utiliies.Extenreport;
import jdk.internal.org.jline.utils.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdatafrmexceldata{
	public static WebDriver driver;
	@Test(priority = 0, dataProvider = "getdata", dataProviderClass = ExceldatreaderUtils.class)
	public static void login(@Optional("test") String username, String password) throws InterruptedException, IOException {
		Extenreport.setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Extenreport.addsteps("Entered password");
		Thread.sleep(5000);
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();
		driver.quit();
	}
}
