package Testlearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pagefactrylearn {
	

	@FindBy (xpath = "//input[@name='username']")
	WebElement usernametxt;
	
	@FindBy (xpath = ("//input[@name='password']"))
	WebElement passwordtxt;
	
	@FindBy (xpath = ("//button[@type='submit']"))
	WebElement loginbtn;
	
	@Test
	public void login() {
		PageFactory.initElements(BaseTest.driver, this);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		usernametxt.sendKeys("Admin");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		passwordtxt.sendKeys("admin123");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginbtn.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
