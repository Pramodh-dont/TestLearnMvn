package Testlearn;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Brokenlinkstestclass {
	@Test
	public void links() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.get("https://www.hyrtutorials.com/");
//		WebElement selen = driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(selen).build().perform();
//		WebElement brokenL = driver.findElement(By.xpath("//a[text()='Broken Links']"));
//		action.moveToElement(brokenL).build().perform();
//		driver.findElement(By.xpath("//a[text()='Link1']")).click();
		List<WebElement> AllLink = driver.findElements(By.tagName("a"));
		int totallink = AllLink.size();
		for (WebElement alllinks : AllLink) {
			String linkurl = alllinks.getAttribute("href");
			System.out.println(linkurl);
			URL url = new URL(linkurl);
			URLConnection urlconnection = url.openConnection();
//			HttpURLConnection httpurlcon = (HttpURLConnection) urlconnection;
//			httpurlcon.setConnectTimeout(1000);
//			httpurlcon.connect();
//			if (httpurlcon.getResponseCode()==200)
//				System.out.println(linkurl + " - " + httpurlcon.getRequestMethod());
//			else
//				System.err.println(linkurl + " - " +httpurlcon.getResponseMessage());
//			httpurlcon.disconnect();
			HttpsURLConnection httpsurlcon = (HttpsURLConnection) urlconnection;
			httpsurlcon.connect();
			if (httpsurlcon.getResponseCode() == 200)
				System.out.println(linkurl + " - " + httpsurlcon.getRequestMethod());
			else
				System.err.println(linkurl + " - " + httpsurlcon.getResponseMessage());
			httpsurlcon.disconnect();
		}
	}
}
