package Testlearn;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDepMethodPractice {

	@Test(groups = {"Sanity","Smoke","Regression"})
	public static void depGrpMethod1() {
		System.out.println("group Sanity,regression,smoke Method is executed");
	}
	@Test(groups = "Sanity")
	public static void depGrpMethod2() {
//		Assert.assertTrue(false);
		System.out.println("group Sanity Method is executed");
	}
	@Test(groups = "Smoke")
	public static void depGrpMethod3() {
		System.out.println("group Smoke Method is executed");
	}
	@Test(groups = "Regression")
	public static void depGrpMethod4() {
		System.out.println("group Regression Method is executed");
	}
	@Test(dependsOnMethods = "depGrpMethod1")
	public static void depGrpMethodOnOthr() {
		System.out.println("group Sanity,regression,smoke is executed, so this is executed");
	}
	@Test(dependsOnGroups = "Smoke")
	public static void depGrpOnOthrGrp() {
		System.out.println("group Smoke group is executed, so this is executed");
	}
	@Test(dependsOnGroups = "Regression")
	public static void depGrpOnOthrGrp1() {
		System.out.println("group Regression group is executed, so this is executed");
	}
	@Test(dependsOnGroups = "Sanity")
	public static void depGrpOnOthrGrp2() {
		System.out.println("group Sanity group is executed, so this is executed");
	}
	@Test(dependsOnMethods = {"depGrpMethod2"},alwaysRun = true)
	public static void depOnOthrMethodAlwaysRun() {
		System.out.println("Always run annotation used, so this is executed");
	}
	@Test(dependsOnMethods = {"depGrpMethod3"},ignoreMissingDependencies = true)
	public static void depOnOthrMethodIgnoren() {
		System.out.println("depGrpMethod3 is missing/ignored but used ignoreMissingDependecies, so this is executed");
	}
}
