package Testlearn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utiliies.Extenreport;

public class ReportTestCase {

	public static WebDriver driver;
	@BeforeTest
	public static void initbrowser() {
		Extenreport.setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public static void login() throws InterruptedException, IOException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		Extenreport.addsteps("Opened application");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(1000);
		Extenreport.addsteps("Entered username");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		Extenreport.addsteps("Entered password");
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(5000);
		loginbtn.click();
		Extenreport.addsteps("Login successfull");
	}
	@Test(priority = 2)
	public static void logout() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']/parent::li")).click();
		Extenreport.addsteps("click on the username dropdown");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(1000);
		Extenreport.addsteps("Logged Out successfull and closing browser");
	}
	@Test(priority = 3)
	public static void CloseBrowser() throws IOException {
		driver.quit();
	}


}
