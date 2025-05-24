package ParallelExecutiontionPractice;

import org.testng.annotations.Test;

public class RegisterUser {

	@Test(priority = 3)
	public static void registerWithValidCredentials() {
		System.out.println("registerWithValidCredentials"+Thread.currentThread().getId());
	}
	@Test(priority = 1)
	public static void registerWithInValidCredentials() {
		System.out.println("registerWithInValidCredentials"+Thread.currentThread().getId());
	}
	@Test(priority = 2)
	public static void registerWithInValidEmail() {
		System.out.println("registerWithInValidEmail"+Thread.currentThread().getId());
	}
}
