package Testlearn;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidebypropfile {
	WebDriver driver;
	 @Test(priority = 0)
	public void LoginTest() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(getData("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getData("password"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	public String getData(String key) throws IOException {
		File file=new File("C:\\Users\\user\\eclipse-workspace\\Testautolearn\\src\\test\\resources\\datacred.properties");
		FileReader reader = new FileReader(file);
		Properties prop =new Properties();
		prop.load(reader);
		prop.getProperty(key);
		return (String) prop.getProperty(key);
	}
}
