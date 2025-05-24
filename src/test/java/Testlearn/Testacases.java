package Testlearn;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utiliies.Extenreport;

public class Testacases {
	@BeforeTest
	public static void test() throws IOException {
		Extenreport.setup();
		System.out.println("test1 executed");
	}
	
	@Test
	public static void test1() throws IOException {
		System.out.println("test1 executed");
		Extenreport.addsteps("test1 executed by testng");
	}
	@Test
	public static void test2() {
		System.out.println("test2 executed");
	}
	@Test
	public static void test3() {
		System.out.println("test3 executed");
	}
	@Test
	public static void test4() {
		System.out.println("test4 executed");
	}
	
}
