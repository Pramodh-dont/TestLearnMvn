package Testlearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleStaleElement {
	@Test
	public static void SampleCheckBoxIdentify() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		search.clear();
		search.sendKeys("laptop");
		search.sendKeys(Keys.ENTER);
		WebElement checke= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		if(checke.getAttribute("checked") == null) {
			driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']")).click();
		}
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Get It by Tomorrow']")));
		WebElement after= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		String a= after.getAttribute("checked");
		System.out.println(a);
		driver.quit();
	}
	
}
