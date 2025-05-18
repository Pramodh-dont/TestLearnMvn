package Testlearn;


import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FileUploadTestLearn extends BaseTest {
	@Test
	public static void UpploadFile() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/upload");
		try {
		File fileOfUpload= new File("C:\\Users\\user\\eclipse-workspace\\Testautolearn\\reports1\\test.png");
		driver.findElement(By.id("file-upload")).sendKeys(fileOfUpload.toString());
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		Thread.sleep(1000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(1000);
		WebElement up= driver.findElement(By.id("uploaded-files"));
		String fileNameOfUploaded=up.getText();
		assertEquals("test.png", fileNameOfUploaded);
		System.out.println(fileNameOfUploaded);
	}
}
