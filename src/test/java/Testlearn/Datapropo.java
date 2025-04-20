package Testlearn;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Datapropo {
	
	public String getData(String key) throws IOException {
		File file=new File("E:\\Softwares\\java\\data.propeties");
		FileReader reader = new FileReader(file);
		Properties prop =new Properties();
		prop.load(reader);
//		System.out.println(prop.getProperty("username"));
		prop.getProperty(key);
		return (String) prop.getProperty(key);
	}
	@Test
	public void data() throws IOException {
		System.out.println(getData("username"));
		System.out.println(getData("password"));
	}
}
