package ParallelExecutiontionPractice;

import org.testng.annotations.Test;

public class SearchInWebsite {

	@Test(priority = 1)
	public static void searchOne() {
		System.out.println("searchOne"+Thread.currentThread().getId());
	}
	@Test(priority = 2)
	public static void searchTwo() {
		System.out.println("searchTwo"+Thread.currentThread().getId());
	}
	@Test(priority = 3)
	public static void searchThree() {
		System.out.println("searchThree"+Thread.currentThread().getId());
	}
	
}
