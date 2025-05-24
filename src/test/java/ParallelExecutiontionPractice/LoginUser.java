package ParallelExecutiontionPractice;

import org.testng.annotations.Test;

public class LoginUser {
	@Test(priority = 3)
	public static void loginWithValidCredentials() {
		System.out.println("registerWithValidCredentials"+Thread.currentThread().getId());
	}
	@Test(priority = 1)
	public static void loginrWithInValidCredentials() {
		System.out.println("registerWithInValidCredentials"+Thread.currentThread().getId());
	}
	@Test(priority = 2)
	public static void loginWithInValidEmail() {
		System.out.println("registerWithInValidEmail"+Thread.currentThread().getId());
	}
}
