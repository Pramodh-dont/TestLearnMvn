package ParallelExecutiontionPractice;

import org.testng.annotations.Test;

public class LogoutUser {

	@Test
	public static void logOutUser() {
		System.out.println("Logged out"+Thread.currentThread().getId());
	}

}
