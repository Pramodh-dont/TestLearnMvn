package Testlearn;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Fullpagescreenshot {
	public static WebDriver driver;
	@Test
	public static void cap_full_screen() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Screenshot SC = new AShot().takeScreenshot(driver);
		File filepath = new File("C:\\Users\\user\\eclipse-workspace\\Testautolearn\\reports1\\test.png");
		try {
			ImageIO.write(SC.getImage(), "png", filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cap_scroll_page();
		driver.quit();
	}
	public static void cap_scroll_page() {
	Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	File filepath1 = new File("C:\\Users\\user\\eclipse-workspace\\Testautolearn\\reports1\\test1.png");
	try {
		ImageIO.write(s.getImage(),"png", filepath1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
