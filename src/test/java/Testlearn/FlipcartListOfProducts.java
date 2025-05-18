package Testlearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// List of product with thier name, actual price, offered price, discount% and delivery charges
public class FlipcartListOfProducts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mouse&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		List<WebElement> Allprod = driver.findElements(By.xpath("//a[@target='_blank']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"hl05eU\"]/child::div[1]"));
		for(WebElement Allprodnames : Allprod ) {
				System.out.println(Allprodnames.getText());
		}
	}
}
