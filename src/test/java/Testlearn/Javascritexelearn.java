package Testlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascritexelearn {
	public static WebDriver driver;
	@Test
	public static void javaexelearn() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement swe = driver.findElement(By.linkText("Status Codes"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", swe);
		js.executeScript("arguments[0].click()", swe);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.findElement(By.linkText("Forgot Password")).click();
		js.executeScript("document.getElementById('email').value='admin'");
		driver.navigate().back();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit(); 
	}
}
